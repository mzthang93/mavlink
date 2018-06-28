package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Deprecated. Use {@link io.dronefleet.mavlink.common.BatteryStatus BATTERY_STATUS} instead. 2nd Battery status 
 */
@MavlinkMessageInfo(
        id = 181,
        crc = 174
)
public final class Battery2 {
    private final int voltage;

    private final int currentBattery;

    private Battery2(int voltage, int currentBattery) {
        this.voltage = voltage;
        this.currentBattery = currentBattery;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * voltage in millivolts 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2
    )
    public final int voltage() {
        return this.voltage;
    }

    /**
     * Battery current, in centiamperes (1 = 10 milliampere), -1: autopilot does not measure the 
     * current 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            signed = true
    )
    public final int currentBattery() {
        return this.currentBattery;
    }

    public static final class Builder {
        private int voltage;

        private int currentBattery;

        /**
         * voltage in millivolts 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2
        )
        public final Builder voltage(int voltage) {
            this.voltage = voltage;
            return this;
        }

        /**
         * Battery current, in centiamperes (1 = 10 milliampere), -1: autopilot does not measure the 
         * current 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                signed = true
        )
        public final Builder currentBattery(int currentBattery) {
            this.currentBattery = currentBattery;
            return this;
        }

        public final Battery2 build() {
            return new Battery2(voltage, currentBattery);
        }
    }
}
