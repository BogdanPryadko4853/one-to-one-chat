package com.bogdan.webSocket.chat;


import com.bogdan.webSocket.chatRoom.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository repository;
    private ChatRoomService chatRoomService;

    public ChatMessage save(ChatMessage message) {
        var chatRoomId = chatRoomService.getChatRoomId(
                message.getSenderId(), message.getRecipientId(), true
        ).orElseThrow();

        message.setId(chatRoomId);
        repository.save(message);
        return message;
    }

    public List<ChatMessage> findChatMessages(String senderId, String recipientId) {
        var chatRoomId = chatRoomService.getChatRoomId(senderId, recipientId, false);
        return chatRoomId.map(repository::findByChatId).orElse(new ArrayList<>());
    }
}
