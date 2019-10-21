package com.projects.CharacterGenerator.character.classes;

import com.projects.CharacterGenerator.util.ImmutableCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public final class ClassManager {

    private static List<String> classOrder = new ArrayList<>(); // We're going to be using direct number accessing on this, use ArrayList, it's faster.

    private static Map<String, Class<? extends ICharacterClass>> classes = new HashMap<>();

    public static void registerClass(Class<? extends ICharacterClass> clazz, String key) {
        if (classes.putIfAbsent(key, clazz) == null) {
            classOrder.add(key);
        }
    }

    public static ICharacterClass getClass(String key) {
        Class<? extends ICharacterClass> clazz = classes.getOrDefault(key, null);

        if (clazz == null) {
            throw new IllegalArgumentException(key + " doesn't represent a registered class!");
        }

        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e); // Throw exception up.
        }
    }

    public static ImmutableCollection<Map.Entry<String, Class<? extends ICharacterClass>>> getRegisteredClasses() {
        return new ImmutableCollection<>(classes.entrySet());
    }

    public static ICharacterClass getRandomClass() {
        return getClass(classOrder.get(ThreadLocalRandom.current().nextInt(0, classOrder.size())));
    }
}
