package com.decoratorPattern;

import com.decoratorPattern.character.ICharacter;
import com.decoratorPattern.character.Mario;
import com.decoratorPattern.decorator.AttackDecorator;
import com.decoratorPattern.decorator.FlyDecorator;
import com.decoratorPattern.decorator.ShineDecorator;

public class DecoratorApplication {

    public static void main(String[] args) {

        ICharacter mario = new Mario();

        System.out.println("Basic Character : "+mario.getAbilities());

        mario = new FlyDecorator(mario);

        System.out.println("Fly Character : " + mario.getAbilities());

        mario = new AttackDecorator(mario);

        System.out.println("Attack Character : " + mario.getAbilities());

        mario = new ShineDecorator(mario);

        System.out.println("Shine Character : " + mario.getAbilities());

    }
}
