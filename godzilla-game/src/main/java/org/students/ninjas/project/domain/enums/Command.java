package org.students.ninjas.project.domain.enums;


import lombok.Getter;

@Getter
public enum Command {
    COMPILE("javac"),
    RUN("java"),
    PACKAGE("jar");

    private final String command;

    Command(String command) {
        this.command = command;
    }

}
