package com.github.solairerove.leprosorium.reactive;

import io.reactivex.Flowable;

/**
 * Created by solairerove on 4/5/17.
 */
public class ReactiveExample {
    public static void main(String... args) {
        System.out.println("Hello");

        Flowable.just("Simple reactive").subscribe(System.out::println);

        Flowable.fromArray(1, 2, 3, 4).subscribe(
                i -> System.out.printf("Entry %d\n", i),
                e -> System.out.printf("Failed to process: %s\n", e),
                () -> System.out.println("Done")
        );
    }
}
