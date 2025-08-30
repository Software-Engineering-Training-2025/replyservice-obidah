package org.example;

import java.util.HashMap;
import java.util.Map;

public class ReplyService {

    public String reply(String message, ReplyType type) {

        Map<String, Map<String, String>> responses = new HashMap<>();

        Map<String, String> hiResponses = new HashMap<>();
        hiResponses.put("FORMAL", "Hello. How may I assist you today?");
        hiResponses.put("FRIENDLY", "Hey there! 😊 How can I help?");
        hiResponses.put("CONCISE", "Hello. How can I help?");
        responses.put("hi", hiResponses);

        Map<String, String> helloResponses = new HashMap<>();
        helloResponses.put("FORMAL", "Hello. How may I assist you today?");
        helloResponses.put("FRIENDLY", "Hi! 👋 What’s up?");
        helloResponses.put("CONCISE", "Hello. How can I help?");
        responses.put("hello", helloResponses);

        Map<String, String> howAreYouResponses = new HashMap<>();
        howAreYouResponses.put("FORMAL", "I am functioning properly. How may I assist you?");
        howAreYouResponses.put("FRIENDLY", "Doing great! 😄 How can I help?");
        howAreYouResponses.put("CONCISE", "I’m good. How can I help?");
        responses.put("how are you", howAreYouResponses);

        Map<String, String> iNeedHelpResponses = new HashMap<>();
        iNeedHelpResponses.put("FORMAL", "I can assist with that. Please provide more details.");
        iNeedHelpResponses.put("FRIENDLY", "I’ve got you! 🙂 Tell me a bit more.");
        iNeedHelpResponses.put("CONCISE", "Share details; I’ll help.");
        responses.put("i need help", iNeedHelpResponses);

        Map<String, String> accountResponses = new HashMap<>();
        accountResponses.put("FORMAL", "Certainly. Please describe the account issue.");
        accountResponses.put("FRIENDLY", "Sure thing! 😊 What’s wrong with the account?");
        accountResponses.put("CONCISE", "Describe the account issue…");
        responses.put("can you help me with my account", accountResponses);

        Map<String, String> thanksResponses = new HashMap<>();
        thanksResponses.put("FORMAL", "You are welcome.");
        thanksResponses.put("FRIENDLY", "Anytime! 🙌");
        thanksResponses.put("CONCISE", "You’re welcome.");
        responses.put("thanks", thanksResponses);

        Map<String, String> byeResponses = new HashMap<>();
        byeResponses.put("FORMAL", "Goodbye.");
        byeResponses.put("FRIENDLY", "See you later! 👋");
        byeResponses.put("CONCISE", "Goodbye.");
        responses.put("bye", byeResponses);

        Map<String, String> nameResponses = new HashMap<>();
        nameResponses.put("FORMAL", "I am your virtual assistant.");
        nameResponses.put("FRIENDLY", "I’m your helper bot 🤖");
        nameResponses.put("CONCISE", "I’m your assistant.");
        responses.put("what is your name", nameResponses);

        Map<String, String> otherResponses = new HashMap<>();
        otherResponses.put("FORMAL", "Could you clarify your request?");
        otherResponses.put("FRIENDLY", "Could you tell me more?");
        otherResponses.put("CONCISE", "Please clarify.");
        responses.put("any other text", otherResponses);

        Map<String, String> emptyResponses = new HashMap<>();
        emptyResponses.put("FORMAL", "Please say something.");
        emptyResponses.put("FRIENDLY", "Please say something.");
        emptyResponses.put("CONCISE", "Please say something.");
        responses.put(null, emptyResponses);
        responses.put("", emptyResponses);
        responses.put(" ", emptyResponses);

        if (message == null || message.trim().isEmpty()) {
            message = "";
        }

        Map<String, String> replyTypes = responses.get(message.toLowerCase());

        if (replyTypes == null) {
            replyTypes = responses.get("any other text");
        }

        return replyTypes.get(type.name());
    }
}
