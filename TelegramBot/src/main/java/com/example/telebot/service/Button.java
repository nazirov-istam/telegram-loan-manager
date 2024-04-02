package com.example.telebot.service;

import com.example.telebot.controller.TelegramBotController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

@Component
public class Button {
    @Lazy
    @Autowired
    TelegramBotController telegramBotController;

    public void buttonStart(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText("Tilni tanlang !\nВыберите язык !\nChoose a language !");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow first = new KeyboardRow();
        KeyboardButton russian = new KeyboardButton();
        russian.setText("\\uD83C\\uDDF7\\uD83C\\uDDFA Ru");
        KeyboardButton uzbek = new KeyboardButton();
        russian.setText("\\uD83C\\uDDFA\\uD83C\\uDDFF Uz");
        KeyboardButton english = new KeyboardButton();
        russian.setText("\\uD83C\\uDDFA\\uD83C\\uDDF8 En");
        first.add(uzbek);
        first.add(russian);
        first.add(english);
        rowList.add(first);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void locationYES(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the registration");
        payment.setCallbackData(telegramBotController.getLOCATION());
        var back = new InlineKeyboardButton();
        back.setText("Accept the registration");
        back.setCallbackData(telegramBotController.getLOCATION_ACCEPT());
        rowInLine.add(payment);
        rowInLine1.add(back);
        rowsInLine.add(rowInLine);
        rowsInLine.add(rowInLine1);
        markup.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markup);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void phoneYes(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the number linked to the card\n");
        payment.setCallbackData(telegramBotController.getPHONE_BUTTON());
        var back = new InlineKeyboardButton();
        back.setText("Accept the number");
        back.setCallbackData(telegramBotController.getPHONE_BUTTON_ACCEPT());
        rowInLine.add(payment);
        rowInLine1.add(back);
        rowsInLine.add(rowInLine);
        rowsInLine.add(rowInLine1);
        markupInLine.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markupInLine);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void clinicYes(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the name of the clinic.");
        payment.setCallbackData(telegramBotController.getCLINIC());
        var back = new InlineKeyboardButton();
        back.setText("Accept the name of the clinic.");
        back.setCallbackData(telegramBotController.getCLINIC_ACCEPT());
        rowInLine.add(payment);
        rowInLine1.add(back);
        rowsInLine.add(rowInLine);
        rowsInLine.add(rowInLine1);
        markupInLine.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markupInLine);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void moneyYes(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the money.");
        payment.setCallbackData(telegramBotController.getCLINIC());
        var back = new InlineKeyboardButton();
        back.setText("Accept the money.");
        back.setCallbackData(telegramBotController.getCLINIC_ACCEPT());
        rowInLine.add(payment);
        rowInLine1.add(back);
        rowsInLine.add(rowInLine);
        rowsInLine.add(rowInLine1);
        markupInLine.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markupInLine);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void operationYes(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the name of the operation.");
        payment.setCallbackData(telegramBotController.getOPERATION());
        var back = new InlineKeyboardButton();
        back.setText("Accept the name of the operation.");
        back.setCallbackData(telegramBotController.getOPERATION_ACCEPT());
        rowInLine.add(payment);
        rowInLine1.add(back);
        rowsInLine.add(rowInLine);
        rowsInLine.add(rowInLine1);
        markupInLine.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markupInLine);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void passportBack(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the back side of the passport.");
        payment.setCallbackData(telegramBotController.getPASSPORT_BUTTON_BACK());
        var back = new InlineKeyboardButton();
        back.setText("Accept the back side of the passport.");
        back.setCallbackData(telegramBotController.getNO_BUTTON_BACK());
        rowInLine.add(payment);
        rowInLine1.add(back);
        rowsInLine.add(rowInLine);
        rowsInLine.add(rowInLine1);
        markupInLine.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markupInLine);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void cardYes(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine2 = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine1 = new ArrayList<>();
        List<InlineKeyboardButton> rowInLine3 = new ArrayList<>();
        var payment = new InlineKeyboardButton();
        payment.setText("Resend the photo of the plastic card.");
        payment.setCallbackData(telegramBotController.getCARD());
        var back = new InlineKeyboardButton();
        back.setText("Accept the plastic card.");
        back.setCallbackData(telegramBotController.getCARDA());
        var accept = new InlineKeyboardButton();
        accept.setText("Accept all documents. ✅");
        accept.setCallbackData(telegramBotController.getACCEPT_BUTTON());
        var reject = new InlineKeyboardButton();
        reject.setText("Deny the loan. ❌");
        reject.setCallbackData(telegramBotController.getREJECT());
        rowInLine2.add(payment);
        rowInLine1.add(back);
        rowInLine3.add(accept);
        rowInLine3.add(reject);
        rowsInLine.add(rowInLine2);
        rowsInLine.add(rowInLine1);
        rowsInLine.add(rowInLine3);
        markupInLine.setKeyboard(rowsInLine);
        sendMessage.setReplyMarkup(markupInLine);
        try {
            telegramBotController.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
