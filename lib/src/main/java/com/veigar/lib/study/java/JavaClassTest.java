package com.veigar.lib.study.java;

import com.veigar.lib.study.kotlin.KotlinTestKt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

/**
 * @description:
 * @author: houwj
 * @date: 2020/8/17
 */
public class JavaClassTest {
    public static void main(String[] args) {
        // Test.sayMessage("hello");
        // Test.INSTANCE.sayMessage("hello");

        test1();

        KotlinTestKt.test1();
    }

    /**
     * 调用Kotlin的扩展函数
     */
    private static void test1() {
        File file = new File("gradle.properties");
        String content = FilesKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }

}
