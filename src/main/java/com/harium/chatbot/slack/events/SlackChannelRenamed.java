package com.harium.chatbot.slack.events;

import com.harium.chatbot.slack.SlackChannel;

public class SlackChannelRenamed implements SlackEvent {
    private SlackChannel slackChannel;
    private String newName;

    public SlackChannelRenamed(SlackChannel slackChannel, String name) {
        this.slackChannel = slackChannel;
        this.newName = name;
    }

    @Override
    public SlackEventType getEventType() {
        return SlackEventType.SLACK_CHANNEL_RENAMED;
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public void setSlackChannel(SlackChannel slackChannel) {
        this.slackChannel = slackChannel;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }
}
