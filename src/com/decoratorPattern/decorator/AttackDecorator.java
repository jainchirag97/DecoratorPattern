package com.decoratorPattern.decorator;

import com.decoratorPattern.character.ICharacter;

public class AttackDecorator implements CharacterDecorator {

    private ICharacter character;

    public AttackDecorator(ICharacter character) {
        this.character = character;
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + ", Attack";
    }
}
