package com.decoratorPattern.decorator;

import com.decoratorPattern.character.ICharacter;

public class FlyDecorator implements CharacterDecorator {

    private ICharacter character;

    public FlyDecorator(ICharacter character) {
        this.character = character;
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + ", Fly";
    }
}
