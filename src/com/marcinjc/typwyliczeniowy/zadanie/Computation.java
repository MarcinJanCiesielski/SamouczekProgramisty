package com.marcinjc.typwyliczeniowy.zadanie;

public enum Computation {
    MULTIPY {
        @Override
        public double perform(double x, double y) {
            return x*y;
        }
    },
    DIVIDE {
        @Override
        public double perform(double x, double y) {
            return x/y;
        }
    },
    ADD{
        @Override
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBSTRACT {
        @Override
        public double perform(double x, double y) {
            return x-y;
        }
    };

    public abstract double perform(double x, double y);
}
