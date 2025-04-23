package com.walking.Lesson_17;

public enum Answers {
    HI("Hi","Hello"),
    BYE("Bye","Good bye"),
    HOW_ARE_YOU("How are you","How are your doing"),
    DEFAULT(null,"Unknown message");

    private final String greeting;
    private final String answer;

    Answers(String greeting, String answer){
        this.greeting = greeting;
        this.answer = answer;
    }

    public static Answers findGreetingType(String greeting) {
        if (greeting == null) {
            return DEFAULT;
        }

        for (Answers gt : Answers.values()) {
            if (greeting.equals(gt.greeting)) {
                return gt;
            }

        }
        return DEFAULT;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getAnswer () {
        return answer;
    }

}






