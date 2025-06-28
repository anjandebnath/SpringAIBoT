package dev.ai.spring.chat;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ChatController {

    ChatClient chatClient;

    public ChatController(ChatClient.Builder builder){

        this.chatClient = builder.build();

    }

   
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/chat")
    public String chat(){

        return chatClient.prompt()
        .user("Tell me an interesting fact about java")
        .call()
        .content();

    }
}
