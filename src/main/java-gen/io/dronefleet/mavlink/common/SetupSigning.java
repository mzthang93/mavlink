package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.math.BigInteger;

/**
 * Setup a MAVLink2 signing key. If called with secret_key of all zero and zero initial_timestamp 
 * will disable signing 
 */
@MavlinkMessageInfo(
        id = 256,
        crc = 71
)
public final class SetupSigning {
    private final int targetSystem;

    private final int targetComponent;

    private final byte[] secretKey;

    private final BigInteger initialTimestamp;

    private SetupSigning(int targetSystem, int targetComponent, byte[] secretKey,
            BigInteger initialTimestamp) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.secretKey = secretKey;
        this.initialTimestamp = initialTimestamp;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * system id of the target 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * component ID of the target 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * signing key 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 32
    )
    public final byte[] secretKey() {
        return this.secretKey;
    }

    /**
     * initial timestamp 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 8
    )
    public final BigInteger initialTimestamp() {
        return this.initialTimestamp;
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private byte[] secretKey;

        private BigInteger initialTimestamp;

        /**
         * system id of the target 
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
         * component ID of the target 
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
         * signing key 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 32
        )
        public final Builder secretKey(byte[] secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * initial timestamp 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 8
        )
        public final Builder initialTimestamp(BigInteger initialTimestamp) {
            this.initialTimestamp = initialTimestamp;
            return this;
        }

        public final SetupSigning build() {
            return new SetupSigning(targetSystem, targetComponent, secretKey, initialTimestamp);
        }
    }
}
