package org.example.builder.example2;

public class SequenceBuilder {
    private String type;
    private int id;

    public SequenceBuilder(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public SequenceBuilder() {
    }

    public static class Builder {
        private SequenceBuilder sequenceBuilder = new SequenceBuilder();

        public Builder type(String type) {
            sequenceBuilder.type = type;
            return this;
        }

        public Builder id(int id) {
            if ("period".equals(sequenceBuilder.type)) {
                sequenceBuilder.id = id + 100;
            }
            else {
                sequenceBuilder.id = id;
            }
            return this;
        }

        public SequenceBuilder build() {
            return sequenceBuilder;
        }

    }
}
