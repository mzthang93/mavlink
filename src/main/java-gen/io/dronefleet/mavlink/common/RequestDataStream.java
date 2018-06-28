package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * THIS INTERFACE IS DEPRECATED. USE SET_MESSAGE_INTERVAL INSTEAD. 
 */
@MavlinkMessageInfo(
        id = 66,
        crc = 148
)
public final class RequestDataStream {
    private final int targetSystem;

    private final int targetComponent;

    private final int reqStreamId;

    private final int reqMessageRate;

    private final int startStop;

    private RequestDataStream(int targetSystem, int targetComponent, int reqStreamId,
            int reqMessageRate, int startStop) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.reqStreamId = reqStreamId;
        this.reqMessageRate = reqMessageRate;
        this.startStop = startStop;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The target requested to send the message stream. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * The target requested to send the message stream. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * The ID of the requested data stream 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int reqStreamId() {
        return this.reqStreamId;
    }

    /**
     * The requested message rate 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2
    )
    public final int reqMessageRate() {
        return this.reqMessageRate;
    }

    /**
     * 1 to start sending, 0 to stop sending. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1
    )
    public final int startStop() {
        return this.startStop;
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int reqStreamId;

        private int reqMessageRate;

        private int startStop;

        /**
         * The target requested to send the message stream. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * The target requested to send the message stream. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * The ID of the requested data stream 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder reqStreamId(int reqStreamId) {
            this.reqStreamId = reqStreamId;
            return this;
        }

        /**
         * The requested message rate 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2
        )
        public final Builder reqMessageRate(int reqMessageRate) {
            this.reqMessageRate = reqMessageRate;
            return this;
        }

        /**
         * 1 to start sending, 0 to stop sending. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1
        )
        public final Builder startStop(int startStop) {
            this.startStop = startStop;
            return this;
        }

        public final RequestDataStream build() {
            return new RequestDataStream(targetSystem, targetComponent, reqStreamId, reqMessageRate, startStop);
        }
    }
}
