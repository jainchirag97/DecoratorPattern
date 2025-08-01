package com.decoratorPattern.decorator;

import com.decoratorPattern.character.ICharacter;

public class ShineDecorator implements CharacterDecorator{

    private ICharacter character;

    public ShineDecorator(ICharacter character) {
        this.character = character;
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + ", Shines";
    }
}
