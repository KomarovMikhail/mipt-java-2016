package ru.mipt.java2016.homework.g597.moiseev.task2;

import ru.mipt.java2016.homework.base.task2.KeyValueStorage;
import ru.mipt.java2016.homework.tests.task2.AbstractSingleFileStorageTest;
import ru.mipt.java2016.homework.tests.task2.Student;
import ru.mipt.java2016.homework.tests.task2.StudentKey;

import java.io.IOException;

/**
 * Тестер для дисковое хранилища.
 *
 * @author Fedor Moiseev
 * @since 26.10.16
 */
public class MyKeyValueStorageTest extends AbstractSingleFileStorageTest {

    @Override
    protected KeyValueStorage<String, String> buildStringsStorage(String path) {
        try {
            return new MyKeyValueStorage<String, String>(path, "storage.db", StringSerialization.getInstance(),
                    StringSerialization.getInstance());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected KeyValueStorage<Integer, Double> buildI2DStorage(String path) {
        try {
            return new MyKeyValueStorage<Integer, Double>(path, "storage.db", IntegerSerialization.getInstance(), DoubleSerialization.getInstance());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected KeyValueStorage<StudentKey, Student> buildStudentsStorage(String path) {
        try {
            return new MyKeyValueStorage<StudentKey, Student>(path, "storage.db", StudentKeySerialization.getInstance(), StudentSerialization.getInstance());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
