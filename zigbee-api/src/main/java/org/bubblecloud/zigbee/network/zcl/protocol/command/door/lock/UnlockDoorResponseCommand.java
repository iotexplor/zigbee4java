package org.bubblecloud.zigbee.network.zcl.protocol.command.door.lock;

import org.bubblecloud.zigbee.network.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.network.zcl.ZclUtil;
import org.bubblecloud.zigbee.network.zcl.ZclCommand;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.network.zcl.protocol.ZclFieldType;
import org.bubblecloud.zigbee.network.packet.ZToolAddress64;

/**
 * Code generated Unlock Door Response Command value object class.
 */
public class UnlockDoorResponseCommand extends ZclCommand {
    /**
     * Status command message field.
     */
    private Byte status;

    /**
     * Default constructor setting the command type field.
     */
    public UnlockDoorResponseCommand() {
        this.setType(ZclCommandType.UNLOCK_DOOR_RESPONSE_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public UnlockDoorResponseCommand(final ZclCommandMessage message) {
        super(message);
        this.status = (Byte) message.getFields().get(ZclFieldType.UNLOCK_DOOR_RESPONSE_COMMAND_STATUS);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.UNLOCK_DOOR_RESPONSE_COMMAND_STATUS,status);
        return message;
    }

    /**
     * Gets Status.
     * @return the Status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * Sets Status.
     * @param status the Status
     */
    public void setStatus(final Byte status) {
        this.status = status;
    }

    static {
        ZclUtil.registerCommandTypeClassMapping(ZclCommandType.UNLOCK_DOOR_RESPONSE_COMMAND,UnlockDoorResponseCommand.class);
    }
}