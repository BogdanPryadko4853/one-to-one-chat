package com.bogdan.webSocket.chatRoom;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {

    private final ChatRoomRepository repository;

    public Optional<String> getChatRoomId(String senderId,
                                          String recipientId,
                                          boolean createNewChatRoomIfNotExist) {
        return repository.findBySenderIdAndRecipientId(senderId, recipientId)
                .map(ChatRoom::getId)
                .or(()-> {
                    if (createNewChatRoomIfNotExist) {
                        var chatRoomId = createChatRoomId(senderId, recipientId);
                        return Optional.of(chatRoomId);
                    }

        return Optional.empty();
                        }
                );

    }

    private String createChatRoomId(String senderId, String recipientId) {
        var chatRoomId = String.format("%s_%s", senderId, recipientId);

        ChatRoom senderRecipient =
                ChatRoom
                        .builder()
                        .chatId(chatRoomId)
                        .recipientId(recipientId)
                        .senderId(senderId)
                        .build();
        ChatRoom recipientSender =
                ChatRoom
                        .builder()
                        .chatId(chatRoomId)
                        .recipientId(senderId)
                        .senderId(recipientId)
                        .build();

        repository.save(senderRecipient);
        repository.save(recipientSender);

        return chatRoomId;
    }
}
