package com.marcinjc.klasywewnetrzneianonimowe.zadanie;

public class AnonymousClasses {
    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public interface GreetingModule {
        void sayHello();
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });

        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning" );
            }
        });
        Robot klaus = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("guten Tag");
            }
        });

        jan.saySomething();
        john.saySomething();
        klaus.saySomething();
    }
}
