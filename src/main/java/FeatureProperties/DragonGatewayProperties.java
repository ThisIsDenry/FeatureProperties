package FeatureProperties;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import kaptainwutax.seedutils.mc.pos.CPos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DragonGatewayProperties {
    public final long structureSeed;
    public final CPos chunkPosition;

    public DragonGatewayProperties(long structureSeed, CPos chunkPosition) {
        this.structureSeed = structureSeed;
        this.chunkPosition = chunkPosition;
    }

    public ArrayList<Integer> getGatewayOrder() {
        ArrayList<Integer> gateways = new ArrayList<Integer>();
        gateways.addAll(ContiguousSet.<Integer>create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
        Collections.shuffle(gateways, new Random(structureSeed));
        return gateways;
    }
}
