package com.decoratorPattern.character;

public class Mario implements ICharacter {
    @Override
    public String getAbilities() {
        return "Mario has the following abilities: Run";
    }
}
