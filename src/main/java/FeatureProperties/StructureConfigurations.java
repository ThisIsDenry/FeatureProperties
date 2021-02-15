package FeatureProperties;

public class StructureConfigurations {
    enum BeachShipwreckType
    {
        WITH_MAST(0),
        SIDEWAYS_FULL(1),
        SIDEWAYS_FRONTHALF(2),
        SIDEWAYS_BACKHALF(3),
        RIGHTSIDEUP_FULL(4),
        RIGHTSIDEUP_FRONTHALF(5),
        RIGHTSIDEUP_BACKHALF(6),
        WITH_MAST_DEGRADED(7),
        RIGHTSIDEUP_FULL_DEGRADED(8),
        RIGHTSIDEUP_FRONTHALF_DEGRADED(9),
        RIGHTSIDEUP_BACKHALF_DEGRADED(10);

        public final int index;

        private BeachShipwreckType(int index) {
            this.index = index;
        }
    }

    enum OceanShipwreckType
    {
        WITH_MAST(0),
        UPSIDEDOWN_FULL(1),
        UPSIDEDOWN_FRONTHALF(2),
        UPSIDEDOWN_BACKHALF(3),
        SIDEWAYS_FULL(4),
        SIDEWAYS_FRONTHALF(5),
        SIDEWAYS_BACKHALF(6),
        RIGHTSIDEUP_FULL(7),
        RIGHTSIDEUP_FRONTHALF(8),
        RIGHTSIDEUP_BACKHALF(9),
        WITH_MAST_DEGRADED(10),
        UPSIDEDOWN_FULL_DEGRADED(11),
        UPSIDEDOWN_FRONTHALF_DEGRADED(12),
        UPSIDEDOWN_BACKHALF_DEGRADED(13),
        SIDEWAYS_FULL_DEGRADED(14),
        SIDEWAYS_FRONTHALF_DEGRADED(15),
        SIDEWAYS_BACKHALF_DEGRADED(16),
        RIGHTSIDEUP_FULL_DEGRADED(17),
        RIGHTSIDEUP_FRONTHALF_DEGRADED(18),
        RIGHTSIDEUP_BACKHALF_DEGRADED(19);

        public final int index;

        private OceanShipwreckType(int index) {
            this.index = index;
        }
    }

    enum BastionRemnantType
    {
        HOUSING(0),
        STABLES(1),
        TREASURE(2),
        BRIDGE(3);

        public final int index;

        private BastionRemnantType(int index) {
            this.index = index;
        }
    }
}
