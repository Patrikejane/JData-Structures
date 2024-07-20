package com.loollab.data_structures.threads;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;
import static java.rmi.server.LogStream.log;

/**
 * @author sskma
 * @Created 20/07/2024 - 11:27 PM
 * @project data_structures
 */
@Slf4j
public class VirtualThreads {

    static final Logger logger = LoggerFactory.getLogger(VirtualThreads.class);

    static int numberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    static void log(String message) {
        logger.info("{} | " + message, Thread.currentThread());
    }

    @SneakyThrows
    public static void viewCarrierThreadPoolSize() {
        final ThreadFactory factory = Thread.ofVirtual().name("routine-", 0).factory();
        try (var executor = Executors.newThreadPerTaskExecutor(factory)) {
            IntStream.range(0, numberOfCores() + 1)
                    .forEach(i -> executor.submit(() -> {
                        log("Hello, I'm a virtual thread number " + i);
                        try {
                            sleep( Duration.ofSeconds(1L));
                        } catch (InterruptedException e) {
                            throw new RuntimeException ( e );
                        }
                    }));
        }
    }
}
