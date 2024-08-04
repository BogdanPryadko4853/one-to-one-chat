package com.bogdan.webSocket.chat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatNotification {
    @Id
    private String id;
    private String senderId;
    private String recipientID;
    private String message;
}
