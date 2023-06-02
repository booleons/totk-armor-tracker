import java.util.HashMap;
import java.util.Map;

public class armor {
    private String armorSet;
    private int tier;
    private Map<String, Integer> mats;

    armor (String armorSet, int tier){
        this.armorSet = armorSet;
        this.tier = tier;
        initMats(armorSet, tier);
    }

    public void printMats() {
        for (Map.Entry<String, Integer> entry : mats.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    private void initMats(String armorSet, int tier) {
        mats = new HashMap<String, Integer>();

        switch(armorSet) {
            case "hyl":
                hylian_set(tier);
                break;
            case "wil":
                wild_set(tier);
                break;
            case "zor":
                zora_set(tier);
                break;
            case "voe":
                voe_set(tier);
                break;
            case "sno":
                snowquill_set(tier);
                break;
            case "fla":
                flamebreaker_set(tier);
                break;
            case "she":
                sheikah_set(tier);
                break;
            case "cli":
                climber_set(tier);
                break;
            case "rad":
                radiant_set(tier);
                break;
            case "sol":
                soldier_set(tier);
                break;
            case "dia":
                diamond_circlet(tier);
                break;
            case "rub":
                ruby_circlet(tier);
                break;
            case "sap":
                sapphire_circlet(tier);
                break;
            case "top":
                topaz_earrings(tier);
                break;
            case "opa":
                opal_earrings(tier);
                break;
            case "amb":
                amber_earrings(tier);
                break;
            case "rbr":
                rubber_set(tier);
                break;
            case "bar":
                barbarian_set(tier);
                break;
            case "san":
                sand_boots(tier);
                break;
            case "gli":
                glide_set(tier);
                break;
            case "anc":
                ancient_aspect(tier);
                break;
            case "fro":
                froggy_set(tier);
                break;
            case "min":
                miner_set(tier);
                break;
            case "emb":
                ember_set(tier);
                break;
            case "cha":
                charged_set(tier);
                break;
            case "fsb":
                frostbite_set(tier);
                break;
            case "zon":
                zonaite_set(tier);
                break;
            case "awa":
                awakening_set(tier);
                break;
            case "chm":
                champion_tunic(tier);
                break;
            case "dep":
                depths_set(tier);
                break;
            case "mem":
                memories_tunic(tier);
                break;
            case "yig":
                yiga_set(tier);
                break;
            case "snb":
                snow_boots(tier);
                break;
            case "roy":
                royal_guard_set(tier);
                break;
            case "rut":
                ruta_mask(tier);
                break;
            case "med":
                medoh_mask(tier);
                break;
            case "rud":
                rudania_mask(tier);
                break;
            case "nab":
                naboris_mask(tier);
                break;
            case "tim":
                time_set(tier);
                break;
            case "win":
                wind_set(tier);
                break;
            case "twi":
                twilight_set(tier);
                break;
            case "sky":
                sky_set(tier);
                break;
            case "shk":
                sheik_mask(tier);
                break;
            case "fdh":
                fierce_head(tier);
                break;
            case "fdt":
                fierce_torso(tier);
                break;
            case "fdb":
                fierce_boots(tier);
                break;
            case "her":
                hero_set(tier);
                break;
            
        }
        return;
    }

    
    private void hero_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void fierce_head(int tier) {
        switch(tier) {
            case 1:
                mats.put(bht, 5);
                mats.put(ds, 1);
            case 2:
                mats.put(bhto, 5);
                mats.put(dc, 1);
            case 3:
                mats.put(bhg, 2);
                mats.put(df, 1);
            case 4:
                mats.put(blg, 2);
                mats.put(dh, 1);
                break;
        }
    }

    private void fierce_torso(int tier) {
        switch(tier) {
            case 1:
                mats.put(bht, 5);
            case 2:
                mats.put(bhto, 5);
            case 3:
                mats.put(bhg, 2);
            case 4:
                mats.put(blg, 2);
                break;
        }
    }

    private void fierce_boots(int tier) {
        switch(tier) {
            case 1:
                mats.put(bht, 5);
            case 2:
                mats.put(bhto, 5);
            case 3:
                mats.put(bhg, 2);
            case 4:
                mats.put(blg, 2);
                break;
        }
    }

    private void sheik_mask(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void sky_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void twilight_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void wind_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void time_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    //everything above here needs double checking

    private void naboris_mask(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void rudania_mask(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void medoh_mask(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void ruta_mask(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void royal_guard_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void snow_boots(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void yiga_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void memories_tunic(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void depths_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void champion_tunic(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void awakening_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void zonaite_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void frostbite_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void charged_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void ember_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void miner_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void froggy_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void ancient_aspect(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void glide_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void sand_boots(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void barbarian_set(int tier) {
        switch(tier) {
            case 1:

            case 2:

            case 3:

            case 4:

                break;
        }
    }

    private void rubber_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(cyj, 3);
                mats.put(elh, 1);
            case 2:
                mats.put(cyj, mats.getOrDefault(cyj, 0) + 8);
                mats.put(pv, 5);
            case 3:
                mats.put(mz, 5);
                mats.put(elt, 5);
                mats.put(pes, 8);
            case 4:
                mats.put(gt, 5);
                mats.put(elh, mats.getOrDefault(elh, 0) + 5);
                mats.put(elt, mats.getOrDefault(elt, 0) + 8);
                break;
        }
    }

    private void amber_earrings(int tier) {
        switch(tier) {
            case 1:
                mats.put(ga, 10);
                mats.put(gf, 5);
            case 2:
                mats.put(ga, mats.getOrDefault(ga, 0) + 20);
                mats.put(gf, mats.getOrDefault(gf, 0) + 10);
            case 3:
                mats.put(ga, mats.getOrDefault(ga, 0) + 35);
                mats.put(gf, mats.getOrDefault(gf, 0) + 25);
            case 4:

                break;
        }
    }

    private void opal_earrings(int tier) {
        switch(tier) {
            case 1:
                mats.put(go, 6);
                mats.put(gf, 5);
            case 2:
                mats.put(go, mats.getOrDefault(go, 0) + 12);
                mats.put(gf, mats.getOrDefault(gf, 0) + 10);
            case 3:
                mats.put(go, mats.getOrDefault(go, 0) + 18);
                mats.put(gf, mats.getOrDefault(gf, 0) + 15);
            case 4:
                mats.put(go, mats.getOrDefault(go, 0) + 30);
                mats.put(gf, mats.getOrDefault(gf, 0) + 25);
                break;
        }
    }

    private void topaz_earrings(int tier) {
        switch(tier) {
            case 1:
                mats.put(gt, 2);
                mats.put(gf, 3);
            case 2:
                mats.put(gt, mats.getOrDefault(gt, 0) + 4);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
            case 3:
                mats.put(gt, mats.getOrDefault(gt, 0) + 6);
                mats.put(sf, 1);
            case 4:
                mats.put(gt, mats.getOrDefault(gt, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                break;
        }
    }

    private void sapphire_circlet(int tier) {
        switch(tier) {
            case 1:
                mats.put(gs, 2);
                mats.put(gf, 3);
            case 2:
                mats.put(gs, mats.getOrDefault(gs, 0) + 4);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
            case 3:
                mats.put(gs, mats.getOrDefault(gs, 0) + 6);
                mats.put(sf, 1);
            case 4:
                mats.put(gs, mats.getOrDefault(gs, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                break;
        }
    }

    private void ruby_circlet(int tier) {
        switch(tier) {
            case 1:
                mats.put(gr, 2);
                mats.put(gf, 3);
            case 2:
                mats.put(gr, mats.getOrDefault(gr, 0) + 4);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
            case 3:
                mats.put(gr, mats.getOrDefault(gr, 0) + 6);
                mats.put(sf, 1);
            case 4:
                mats.put(gr, mats.getOrDefault(gr, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                break;
        }
    }

    private void diamond_circlet(int tier) {
        switch(tier) {
            case 1:
                mats.put(gd, 2);
                mats.put(gf, 3);
            case 2:
                mats.put(gd, mats.getOrDefault(gd, 0) + 3);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
            case 3:
                mats.put(gd, mats.getOrDefault(gd, 0) + 5);
                mats.put(sf, 1);
            case 4:
                mats.put(gd, mats.getOrDefault(gd, 0) + 8);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                break;
        }
    }

    private void soldier_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(cj, 5);
                mats.put(bg, 3);
            case 2:
                mats.put(ke, 5);
                mats.put(mg, 3);
            case 3:
                mats.put(gf, 30);
                mats.put(lta, 3);
                mats.put(bhg, 3);
            case 4:
                mats.put(blho, 5);
                mats.put(blg, 5);
                mats.put(ga, 30);
                break;
        }
    }

    private void radiant_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(gl, 10);
                mats.put(bg, 1);
            case 2:
                mats.put(gl, mats.getOrDefault(gl, 0) + 15);
                mats.put(mg, 2);
            case 3:
                mats.put(gl, mats.getOrDefault(gl, 0) + 20);
                mats.put(hg, 3);
                mats.put(gb, 10);
            case 4:
                mats.put(gl, mats.getOrDefault(gl, 0) + 30);
                mats.put(blg, 3);
                mats.put(bmj, 3);
                break;
        }
    }

    private void climber_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(kw, 3);
                mats.put(mr, 3);
            case 2:
                mats.put(ekw, 5);
                mats.put(chl, 5);
            case 3:
                mats.put(chf, 10);
                mats.put(ikw, 8);
            case 4:
                mats.put(psv, 20);
                mats.put(fkw, 10);
                break;
        }
    }

    private void sheikah_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(pbn, 3);
            case 2:
                mats.put(bsf, 5);
                mats.put(pbn, mats.getOrDefault(pbn, 0) + 5);
            case 3:
                mats.put(mss, 8);
                mats.put(css, 5);
            case 4:
                mats.put(ps, 10);
                mats.put(fst, 10);
                mats.put(psp, 5);
                break;
        }
    }

    private void flamebreaker_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(mh, 3);
            case 2:
                mats.put(mf, 5);
                mats.put(cfl, 5);
            case 3:
                mats.put(bmh, 5);
                mats.put(gf, 15);
                mats.put(bsb, 3);
            case 4:
                mats.put(flh, 5);
                mats.put(flt, 10);
                mats.put(gr, 5);
                break;
        }
    }

    private void voe_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(cwj, 3);
            case 2:
                mats.put(cwj, mats.getOrDefault(cwj, 0) + 5);
                mats.put(pcs, 3);
            case 3:
                mats.put(mc, 5);
                mats.put(ikw, 5);
                mats.put(ilt, 3);
            case 4:
                mats.put(ilh, 5);
                mats.put(ilt, mats.getOrDefault(ilt, 0) + 10);
                mats.put(gs, 5);
                break;
        }
    }

    private void snowquill_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(crj, 3);
            case 2:
                mats.put(crj, mats.getOrDefault(crj, 0) + 5);
                mats.put(pws, 3);
            case 3:
                mats.put (ms, 5);
                mats.put(fkw, 5);
                mats.put(flt, 3);
            case 4:
                mats.put(gr, 5);
                mats.put(flh, 5);
                mats.put(flt, mats.getOrDefault(flt, 0) + 10);
                break;
        }
    }

    private void zora_set(int tier) {
        switch (tier) {
            case 1:
                mats.put(lh, 3);
            case 2:
                mats.put(fhb, 5);
                mats.put(lt, 5);
            case 3:
                mats.put(fheb, 3);
                mats.put(lta, 3);
                mats.put(blh, 5);
            case 4:
                mats.put(blah, 5);
                mats.put(blt, 5);
                mats.put(go, 20);
                break;
        }

        return;
    }

    //needs double checking
    private void wild_set(int tier) {
        switch (tier) {
            case 1:
                mats.put(pa, 10);
                mats.put(fs, 2);
            case 2:
                mats.put(bcbh, 5);
                mats.put(fc, 2);
            case 3:
                mats.put(beb, 3);
                mats.put (ff, 2);
                mats.put(fsp, 5);
            case 4:
                mats.put(sf, 3);
                mats.put(fh, 2);
                mats.put(fsp, mats.getOrDefault(fsp, 0) + 10);
                break;
        }

        return;
    }

    private void hylian_set(int tier){
        switch (tier) {
            case 1:
                mats.put(bh, 5);
            case 2:
                mats.put(bbh, 5);
                mats.put(bf, 3);
            case 3:
                mats.put(ga, 20);
                mats.put(bg, 3);
                mats.put(blbh, 5);
            case 4:
                mats.put(ga, mats.getOrDefault(ga, 0) + 30);
                mats.put(bg, mats.getOrDefault(bg, 0) + 5);
                mats.put(sbh, 5);
                break;
        }

        return;
    }

    public Map<String, Integer> getMats() {
        return mats;
    }

    ///Plant foods
    String pa = "Acorn";
    String pv = "Voltfruit";
    String psv = "Swift Violet";
    String pws = "Warm Safflina";
    String pcs = "Cool Safflina";
    String pes = "Electric Safflina";
    String pbn = "Blue Nightshade";
    String psp = "Silent Princess";
    String ps = "Sundelion";

    ///Mushrooms
    String mr = "Rushroom";
    String ms = "Sunshroom";
    String mc = "Chillshroom";
    String mz = "Zapshroom";
    String mss = "Silent Shroom";

    ///Fish
    String fhb = "Hyrule Bass";
    String fheb = "Hearty Bass";
    String fst = "Stealthfin Trout";

    ///Bugs
    String bsb = "Smotherwing Butterfly";
    String bsf = "Sunset Firefly";
    String bcbh = "Courser Bee Honey";
    String beb = "Energetic Rhino Beetle";

    ///Misc Critters
    String chf = "Hot-footed Frog";
    String chl = "Hightail Lizard";
    String cfl = "Fireproof Lizard";
    String css = "Sneaky River Snail";

    ///Monster Parts
    //Bokoblin Parts
    String bf = "Bokoblin Fang";
    String bh = "Bokoblin Horn";
    String bg = "Bokoblin Guts";
    String bbh = "Blue Bokoblin Horn";
    String blbh = "Black Bokoblin Horn";
    String sbh = "Silver Bokoblin Horn";

    //Lizalfos Parts
    String lt = "Lizalfos Talon";
    String lh = "Lizalfos Horn";
    String blh = "Blue Lizalfos Horn";
    String blah = "Black Lizalfos Horn";
    String flh = "Fire-Breath Lizalfos Tail";
    String ilh = "Ice-Breath Lizalfos Horn";
    String elh = "Electric Lizalfos Horn";
    String lta = "Lizalfos Tail";
    String blt = "Blue Lizalfos Tail";
    String flt = "Fire-Breath Lizalfos Tail";
    String ilt = "Ice-Breath Lizalfos Tail";
    String elt = "Electric Lizalfos Tail";

    //Moblin Parts
    String mf = "Moblin Fang";
    String mg = "Moblin Guts";
    String mh = "Moblin Horn";
    String bmh = "Blue Moblin Horn";

    //Horriblin Parts
    String hg = "Horriblin Guts";

    //Keese Parts
    String ke = "Keese Eyeball";
    String kw = "Keese Wing";
    String fkw = "Fire Keese Wing";
    String ikw = "Ice Keese Wing";
    String ekw = "Electric Keese Wing";

    //Chuchu Parts
    String cj = "Chuchu Jelly";
    String crj = "Red Chuchu Jelly";
    String cwj = "White Chuchu Jelly";
    String cyj = "Yellow Chuchu Jelly";

    //Gibdo Parts
    String gb = "Gibdo Bone";

    ///Boss Monster Parts
    //Hinox Parts
    String bhg = "Hinox Guts";
    String bht = "Hinox Toenail";
    String bhto = "Hinox Tooth";

    //Molduga Parts
    String bmj = "Molduga Jaw";

    //Lynel Parts
    String blho = "Lynel Hoof";
    String blg = "Lynel Guts";

    ///Gems
    String gf = "Flint";
    String gl = "Luminous Stone";
    String ga = "Amber";
    String go = "Opal";
    String gr = "Ruby";
    String gs = "Sapphire";
    String gt = "Topaz";
    String gd = "Diamond";

    ///Dragon Parts
    String ds = "Dinraal's Scale";
    String dc = "Dinraal's Claw";
    String dsp = "Shard of Dinraal's Spike";
    String dh = "Dinraal's Horn";
    String df = "Shard of Farosh's Fang";

    String ns = "Naydra's Scale";
    String nc = "Naydra's Claw";
    String nsp = "Shard of Naydra's Spike";
    String nh = "Naydra's Horn";
    String nf = "Shard of Naydra's Fang";

    String fs = "Farosh's Scale";
    String fc = "Farosh's Claw";
    String fsp = "Shard of Farosh's Spike";
    String fh = "Farosh's Horn";
    String ff = "Shard of Farosh's Fang";

    ///Misc
    String sf = "Star Fragment";
}
