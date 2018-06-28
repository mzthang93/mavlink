package io.dronefleet.mavlink.slugs;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Data used in the navigation algorithm. 
 */
@MavlinkMessageInfo(
        id = 176,
        crc = 228
)
public final class SlugsNavigation {
    private final float uM;

    private final float phiC;

    private final float thetaC;

    private final float psidotC;

    private final float ayBody;

    private final float totaldist;

    private final float dist2go;

    private final int fromwp;

    private final int towp;

    private final int hC;

    private SlugsNavigation(float uM, float phiC, float thetaC, float psidotC, float ayBody,
            float totaldist, float dist2go, int fromwp, int towp, int hC) {
        this.uM = uM;
        this.phiC = phiC;
        this.thetaC = thetaC;
        this.psidotC = psidotC;
        this.ayBody = ayBody;
        this.totaldist = totaldist;
        this.dist2go = dist2go;
        this.fromwp = fromwp;
        this.towp = towp;
        this.hC = hC;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Measured Airspeed prior to the nav filter 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final float uM() {
        return this.uM;
    }

    /**
     * Commanded Roll 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4
    )
    public final float phiC() {
        return this.phiC;
    }

    /**
     * Commanded Pitch 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4
    )
    public final float thetaC() {
        return this.thetaC;
    }

    /**
     * Commanded Turn rate 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4
    )
    public final float psidotC() {
        return this.psidotC;
    }

    /**
     * Y component of the body acceleration 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4
    )
    public final float ayBody() {
        return this.ayBody;
    }

    /**
     * Total Distance to Run on this leg of Navigation 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4
    )
    public final float totaldist() {
        return this.totaldist;
    }

    /**
     * Remaining distance to Run on this leg of Navigation 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4
    )
    public final float dist2go() {
        return this.dist2go;
    }

    /**
     * Origin WP 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1
    )
    public final int fromwp() {
        return this.fromwp;
    }

    /**
     * Destination WP 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 1
    )
    public final int towp() {
        return this.towp;
    }

    /**
     * Commanded altitude 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 2
    )
    public final int hC() {
        return this.hC;
    }

    public static final class Builder {
        private float uM;

        private float phiC;

        private float thetaC;

        private float psidotC;

        private float ayBody;

        private float totaldist;

        private float dist2go;

        private int fromwp;

        private int towp;

        private int hC;

        /**
         * Measured Airspeed prior to the nav filter 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder uM(float uM) {
            this.uM = uM;
            return this;
        }

        /**
         * Commanded Roll 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4
        )
        public final Builder phiC(float phiC) {
            this.phiC = phiC;
            return this;
        }

        /**
         * Commanded Pitch 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4
        )
        public final Builder thetaC(float thetaC) {
            this.thetaC = thetaC;
            return this;
        }

        /**
         * Commanded Turn rate 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4
        )
        public final Builder psidotC(float psidotC) {
            this.psidotC = psidotC;
            return this;
        }

        /**
         * Y component of the body acceleration 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4
        )
        public final Builder ayBody(float ayBody) {
            this.ayBody = ayBody;
            return this;
        }

        /**
         * Total Distance to Run on this leg of Navigation 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4
        )
        public final Builder totaldist(float totaldist) {
            this.totaldist = totaldist;
            return this;
        }

        /**
         * Remaining distance to Run on this leg of Navigation 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4
        )
        public final Builder dist2go(float dist2go) {
            this.dist2go = dist2go;
            return this;
        }

        /**
         * Origin WP 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1
        )
        public final Builder fromwp(int fromwp) {
            this.fromwp = fromwp;
            return this;
        }

        /**
         * Destination WP 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 1
        )
        public final Builder towp(int towp) {
            this.towp = towp;
            return this;
        }

        /**
         * Commanded altitude 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 2
        )
        public final Builder hC(int hC) {
            this.hC = hC;
            return this;
        }

        public final SlugsNavigation build() {
            return new SlugsNavigation(uM, phiC, thetaC, psidotC, ayBody, totaldist, dist2go, fromwp, towp, hC);
        }
    }
}
