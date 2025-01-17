package org.example.builder.example1;

import lombok.ToString;

@ToString
public class GameCharacter {
    private String name;
    private int health;
    private int weapon;
    private int armor;

    private GameCharacter() {}

    public static class Builder {
        private GameCharacter character = new GameCharacter();

        public Builder name(String name) {
            character.name = name;
            return this;
        }

        public Builder health(int health) {
            character.health = health;
            return this;
        }

        public Builder weapon(int weapon) {
            character.weapon = weapon;
            return this;
        }

        public Builder armor(int armor) {
            character.armor = armor;
            return this;
        }

        public GameCharacter build() {
            return character;
        }
    }




}
