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
            case "wih":
                wild_head(tier);
                break;
            case "wit":
                wild_torso(tier);
                break;
            case "wib":
                wild_boots(tier);
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
                mats.put(gr, 1);
                mats.put(sf, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gr, mats.getOrDefault(gr, 0) + 4);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gr, mats.getOrDefault(gr, 0) + 6);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gr, mats.getOrDefault(gr, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void fierce_head(int tier) {
        switch(tier) {
            case 1:
                mats.put(bht, 5);
                mats.put(ds, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(bhto, 5);
                mats.put(dc, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(bhg, 2);
                mats.put(df, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(blg, 2);
                mats.put(dh, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void fierce_torso(int tier) {
        switch(tier) {
            case 1:
                mats.put(bht, 5);
                mats.put(ns, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(bhto, 5);
                mats.put(nc, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(bhg, 2);
                mats.put(nf, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(blg, 2);
                mats.put(nh, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void fierce_boots(int tier) {
        switch(tier) {
            case 1:
                mats.put(bht, 5);
                mats.put(fs, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(bhto, 5);
                mats.put(fc, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(bhg, 2);
                mats.put(ff, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(blg, 2);
                mats.put(fh, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void sheik_mask(int tier) {
        switch(tier) {
            case 1:
                mats.put(psp, 1);
                mats.put(sf, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(psp, mats.getOrDefault(psp, 0) + 2);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(psp, mats.getOrDefault(psp, 0) + 4);
                mats.put(sf, mats.getOrDefault(sf, 0) + 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(psp, mats.getOrDefault(psp, 0) + 8);
                mats.put(sf, mats.getOrDefault(sf, 0) + 4);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void sky_set(int tier) {
            switch(tier) {
                case 1:
                    mats.put(gs, 1);
                    mats.put(sf, 1);
                    mats.put(rp, 10);
                case 2:
                    mats.put(gs, mats.getOrDefault(gs, 0) + 4);
                    mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                    mats.put(rp, mats.getOrDefault(rp, 0) + 50);
                case 3:
                    mats.put(gs, mats.getOrDefault(gs, 0) + 6);
                    mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                    mats.put(rp, mats.getOrDefault(rp, 0) + 200);
                case 4:
                    mats.put(gs, mats.getOrDefault(gs, 0) + 10);
                    mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                    mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                    break;
            }
    }

    private void twilight_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(gt, 1);
                mats.put(sf, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gt, mats.getOrDefault(gt, 0) + 4);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gt, mats.getOrDefault(gt, 0) + 6);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gt, mats.getOrDefault(gt, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void wind_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(go, 5);
                mats.put(sf, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(go, mats.getOrDefault(go, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(go, mats.getOrDefault(go, 0) + 15);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(go, mats.getOrDefault(go, 0) + 25);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void time_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(ga, 10);
                mats.put(sf, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(ga, mats.getOrDefault(ga, 0) + 20);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(ga, mats.getOrDefault(ga, 0) + 30);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(ga, mats.getOrDefault(ga, 0) + 40);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void naboris_mask(int tier) {
        switch(tier) {
            case 1:
                mats.put(gz, 5);
                mats.put(gt, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gz, mats.getOrDefault(gz, 0) + 10);
                mats.put(gt, mats.getOrDefault(gt, 0) + 4);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gt, mats.getOrDefault(gt, 0) + 6);
                mats.put(glz, 5);
                mats.put(pdf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gt, mats.getOrDefault(gt, 0) + 10);
                mats.put(glz, mats.getOrDefault(glz, 0) + 10);
                mats.put(pdf, mats.getOrDefault(pdf, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void rudania_mask(int tier) {
        switch(tier) {
            case 1:
                mats.put(gz, 5);
                mats.put(gr, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gz, mats.getOrDefault(gz, 0) + 10);
                mats.put(gr, mats.getOrDefault(gr, 0) + 4);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gr, mats.getOrDefault(gr, 0) + 6);
                mats.put(glz, 5);
                mats.put(pdf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gr, mats.getOrDefault(gr, 0) + 10);
                mats.put(glz, mats.getOrDefault(glz, 0) + 10);
                mats.put(pdf, mats.getOrDefault(pdf, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void medoh_mask(int tier) {
        switch(tier) {
            case 1:
                mats.put(gz, 5);
                mats.put(gs, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gz, mats.getOrDefault(gz, 0) + 10);
                mats.put(gs, mats.getOrDefault(gs, 0) + 4);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gs, mats.getOrDefault(gs, 0) + 6);
                mats.put(glz, 5);
                mats.put(pdf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gs, mats.getOrDefault(gs, 0) + 10);
                mats.put(glz, mats.getOrDefault(glz, 0) + 10);
                mats.put(pdf, mats.getOrDefault(pdf, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void ruta_mask(int tier) {
        switch(tier) {
            case 1:
                mats.put(gz, 5);
                mats.put(go, 5);
                mats.put(rp, 10);
            case 2:
                mats.put(gz, mats.getOrDefault(gz, 0) + 10);
                mats.put(go, mats.getOrDefault(go, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(go, mats.getOrDefault(go, 0) + 15);
                mats.put(glz, 5);
                mats.put(pdf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(go, mats.getOrDefault(go, 0) + 25);
                mats.put(glz, mats.getOrDefault(glz, 0) + 10);
                mats.put(pdf, mats.getOrDefault(pdf, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void royal_guard_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(bg, 3);
                mats.put(bobh, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(bbbh, 3);
                mats.put(bbf, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(blbbh, 3);
                mats.put(bhg, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(sbbh, 3);
                mats.put(bmg, 3);
                mats.put(bgg, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void snow_boots(int tier) {
        switch(tier) {
            case 1:
                mats.put(chl, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(ot, 5);
                mats.put(psc, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(ob, 5);
                mats.put(mr, 20);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(ns, 2);
                mats.put(psv, 20);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void yiga_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(oe, 2);
                mats.put(rp, 10);
            case 2:
                mats.put(mp, 3);
                mats.put(flt, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(ilt, 5);
                mats.put(ke, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(elt, 5);
                mats.put(bbhh, 3);
                mats.put(pmb, 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void memories_tunic(int tier) {
        switch(tier) {
            case 1:
                mats.put(psp, 3);
                mats.put(lds, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(psp, mats.getOrDefault(psp, 0) + 3);
                mats.put(ldt, 1);
                mats.put(fh, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(psp, mats.getOrDefault(psp, 0) + 5);
                mats.put(ldf, 1);
                mats.put(nh, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(psp, mats.getOrDefault(psp, 0) + 10);
                mats.put(ldh, 1);
                mats.put(dh, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void depths_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(bdf, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(gdc, 5);
                mats.put(bff, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gz, 20);
                mats.put(bffn, 3);
                mats.put(boff, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bbwff, 5);
                mats.put(glz, 10);
                mats.put(bfg, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void champion_tunic(int tier) {
        switch(tier) {
            case 1:
                mats.put(psp, 3);
                mats.put(lds, 2);
                mats.put(rp, 10);
            case 2:
                mats.put(psp, mats.getOrDefault(psp, 0) + 3);
                mats.put(ldt, 2);
                mats.put(ps, 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);

            case 3:
                mats.put(psp, mats.getOrDefault(psp, 0) + 5);
                mats.put(ldf, 2);
                mats.put(ps, mats.getOrDefault(ps, 0) + 15);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(psp, mats.getOrDefault(psp, 0) + 10);
                mats.put(ldh, 2);
                mats.put(ps, mats.getOrDefault(ps, 0) + 20);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void awakening_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(gl, 10);
                mats.put(sf, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gl, mats.getOrDefault(gl, 0) + 15);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gl, mats.getOrDefault(gl, 0) + 20);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gl, mats.getOrDefault(gl, 0) + 30);
                mats.put(sf, mats.getOrDefault(sf, 0) + 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);

                break;
        }
    }

    private void zonaite_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(sch, 5);
                mats.put(rp, 10);
            case 2:
                mats.put(sch2, 5);
                mats.put(gz, 5);
                mats.put(cch, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(glz, 5);
                mats.put(cch2, 5);
                mats.put(sch3, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(glz, mats.getOrDefault(glz, 0) + 10);
                mats.put(cch3, 5);
                mats.put(sch4, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void frostbite_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(pif, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(ilh, 5);
                mats.put(bwb, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(ils, 5);
                mats.put(bcd, 5);
                mats.put(lzc, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bgih, 5);
                mats.put(fct, 10);
                mats.put(lzc, mats.getOrDefault(lzc, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void charged_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(psf, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(btb, 3);
                mats.put(elh, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(sls, 5);
                mats.put(bed, 5);
                mats.put(lzc, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bgth, 5);
                mats.put(fvt, 10);
                mats.put(lzc, mats.getOrDefault(lzc, 0) + 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void ember_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(pff, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(flh, 5);
                mats.put(bsub, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(fls, 5);
                mats.put(bwd, 5);
                mats.put(lzc, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bgfh, 5);
                mats.put(fszt, 10);
                mats.put(lzc, mats.getOrDefault(lzc, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void miner_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(bs, 10);
                mats.put(rp, 10);
            case 2:
                mats.put(bs, mats.getOrDefault(bs, 0) + 20);
                mats.put(mbc, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gbs, 15);
                mats.put(bdf, 10);
                mats.put(fgf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gbs, mats.getOrDefault(gbs, 0) + 20);
                mats.put(glz, 10);
                mats.put(gd, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void froggy_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(csl, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(csl, mats.getOrDefault(csl, 0) + 5);
                mats.put(hh, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3: 
                mats.put(bhh, 5);
                mats.put(csf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(blhh, 5);
                mats.put(hg, 10);
                mats.put(go, 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void ancient_aspect(int tier) {
        switch(tier) {
            case 1:
                mats.put(sbh, 9);
                mats.put(bhg, 9);
                mats.put(gz, 15);
                mats.put(rp, 10);
            case 2:
                mats.put(smh, 9);
                mats.put(bfg, 9);
                mats.put(glz, 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(slh, 9);
                mats.put(bmg, 9);
                mats.put(glz, mats.getOrDefault(glz, 0) + 15);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bslsh, 9);
                mats.put(bslmh, 9);
                mats.put(bgg, 9);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void glide_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(kw, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(aw, 5);
                mats.put(ae, 6);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(aw, mats.getOrDefault(aw, 0) + 6);
                mats.put(ae, mats.getOrDefault(ae, 0) + 8);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(aw, mats.getOrDefault(aw, 0) + 10);
                mats.put(gw, 8);
                mats.put(bgw, 12);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void sand_boots(int tier) {
        switch(tier) {
            case 1:
                mats.put(chl, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(gb, 20);
                mats.put(psc, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gg, 5);
                mats.put(mr, 10);
                mats.put(bmf, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bmg, 5);
                mats.put(psv, 10);
                mats.put(chel, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void barbarian_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(pmt, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(mrz, 5);
                mats.put(blsh, 2);
                mats.put(blmh, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(bblsh, 3);
                mats.put(bblmh, 3);
                mats.put(crc, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(bwlsh, 3);
                mats.put(bwlmh, 3);
                mats.put(bbb, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void rubber_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(cyj, 3);
                mats.put(elh, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(cyj, mats.getOrDefault(cyj, 0) + 8);
                mats.put(pv, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(mz, 5);
                mats.put(elt, 5);
                mats.put(pes, 8);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gt, 5);
                mats.put(elh, mats.getOrDefault(elh, 0) + 5);
                mats.put(elt, mats.getOrDefault(elt, 0) + 8);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void amber_earrings(int tier) {
        switch(tier) {
            case 1:
                mats.put(ga, 10);
                mats.put(gf, 5);
                mats.put(rp, 10);
            case 2:
                mats.put(ga, mats.getOrDefault(ga, 0) + 20);
                mats.put(gf, mats.getOrDefault(gf, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(ga, mats.getOrDefault(ga, 0) + 35);
                mats.put(gf, mats.getOrDefault(gf, 0) + 15);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(ga, mats.getOrDefault(ga, 0) + 60);
                mats.put(gf, mats.getOrDefault(gf, 0) + 25);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void opal_earrings(int tier) {
        switch(tier) {
            case 1:
                mats.put(go, 6);
                mats.put(gf, 5);
                mats.put(rp, 10);
            case 2:
                mats.put(go, mats.getOrDefault(go, 0) + 12);
                mats.put(gf, mats.getOrDefault(gf, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(go, mats.getOrDefault(go, 0) + 18);
                mats.put(gf, mats.getOrDefault(gf, 0) + 15);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(go, mats.getOrDefault(go, 0) + 30);
                mats.put(gf, mats.getOrDefault(gf, 0) + 25);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void topaz_earrings(int tier) {
        switch(tier) {
            case 1:
                mats.put(gt, 2);
                mats.put(gf, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(gt, mats.getOrDefault(gt, 0) + 4);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gt, mats.getOrDefault(gt, 0) + 6);
                mats.put(sf, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gt, mats.getOrDefault(gt, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void sapphire_circlet(int tier) {
        switch(tier) {
            case 1:
                mats.put(gs, 2);
                mats.put(gf, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(gs, mats.getOrDefault(gs, 0) + 4);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gs, mats.getOrDefault(gs, 0) + 6);
                mats.put(sf, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gs, mats.getOrDefault(gs, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void ruby_circlet(int tier) {
        switch(tier) {
            case 1:
                mats.put(gr, 2);
                mats.put(gf, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(gr, mats.getOrDefault(gr, 0) + 4);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gr, mats.getOrDefault(gr, 0) + 6);
                mats.put(sf, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gr, mats.getOrDefault(gr, 0) + 10);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void diamond_circlet(int tier) {
        switch(tier) {
            case 1:
                mats.put(gd, 2);
                mats.put(gf, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(gd, mats.getOrDefault(gd, 0) + 3);
                mats.put(gf, mats.getOrDefault(gf, 0) + 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gd, mats.getOrDefault(gd, 0) + 5);
                mats.put(sf, 1);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gd, mats.getOrDefault(gd, 0) + 8);
                mats.put(sf, mats.getOrDefault(sf, 0) + 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void soldier_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(cj, 5);
                mats.put(bg, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(ke, 5);
                mats.put(mg, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gf, 30);
                mats.put(lta, 3);
                mats.put(bhg, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(blho, 5);
                mats.put(blg, 5);
                mats.put(ga, 30);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void radiant_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(gl, 10);
                mats.put(bg, 1);
                mats.put(rp, 10);
            case 2:
                mats.put(gl, mats.getOrDefault(gl, 0) + 15);
                mats.put(mg, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(gl, mats.getOrDefault(gl, 0) + 20);
                mats.put(hg, 3);
                mats.put(gb, 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gl, mats.getOrDefault(gl, 0) + 30);
                mats.put(blg, 3);
                mats.put(bmj, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void climber_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(kw, 3);
                mats.put(mr, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(ekw, 5);
                mats.put(chl, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(chf, 10);
                mats.put(ikw, 8);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(psv, 20);
                mats.put(fkw, 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void sheikah_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(pbn, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(bsf, 5);
                mats.put(pbn, mats.getOrDefault(pbn, 0) + 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(mss, 8);
                mats.put(css, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(ps, 10);
                mats.put(fst, 10);
                mats.put(psp, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void flamebreaker_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(mh, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(mf, 5);
                mats.put(cfl, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(bmh, 5);
                mats.put(gf, 15);
                mats.put(bsb, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(flh, 5);
                mats.put(flt, 10);
                mats.put(gr, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void voe_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(cwj, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(cwj, mats.getOrDefault(cwj, 0) + 5);
                mats.put(pcs, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(mc, 5);
                mats.put(ikw, 5);
                mats.put(ilt, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(ilh, 5);
                mats.put(ilt, mats.getOrDefault(ilt, 0) + 10);
                mats.put(gs, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void snowquill_set(int tier) {
        switch(tier) {
            case 1:
                mats.put(crj, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(crj, mats.getOrDefault(crj, 0) + 5);
                mats.put(pws, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put (ms, 5);
                mats.put(fkw, 5);
                mats.put(flt, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(gr, 5);
                mats.put(flh, 5);
                mats.put(flt, mats.getOrDefault(flt, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }
    }

    private void zora_set(int tier) {
        switch (tier) {
            case 1:
                mats.put(lh, 3);
                mats.put(rp, 10);
            case 2:
                mats.put(fhb, 5);
                mats.put(lt, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(fheb, 3);
                mats.put(lta, 3);
                mats.put(blh, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(blah, 5);
                mats.put(blt, 5);
                mats.put(go, 20);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }

        return;
    }

    private void wild_head(int tier) {
        switch (tier) {
            case 1:
                mats.put(pa, 10);
                mats.put(fs, 2);
                mats.put(rp, 10);
            case 2:
                mats.put(bcbh, 5);
                mats.put(fc, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(beb, 3);
                mats.put (ff, 2);
                mats.put(fsp, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(sf, 3);
                mats.put(fh, 2);
                mats.put(fsp, mats.getOrDefault(fsp, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }

        return;
    }

    private void wild_torso(int tier){
        switch (tier) {
            case 1:
                mats.put(pa, 10);
                mats.put(ns, 2);
                mats.put(rp, 10);
            case 2:
                mats.put(bcbh, 5);
                mats.put(nc, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(beb, 3);
                mats.put (nf, 2);
                mats.put(nsp, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(sf, 3);
                mats.put(nh, 2);
                mats.put(nsp, mats.getOrDefault(nsp, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }

        return;
    }

    private void wild_boots(int tier){
        switch (tier) {
            case 1:
                mats.put(pa, 10);
                mats.put(ds, 2);
                mats.put(rp, 10);
            case 2:
                mats.put(bcbh, 5);
                mats.put(dc, 2);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(beb, 3);
                mats.put (df, 2);
                mats.put(dsp, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(sf, 3);
                mats.put(dh, 2);
                mats.put(dsp, mats.getOrDefault(dsp, 0) + 10);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
                break;
        }

        return;
    }

    private void hylian_set(int tier){
        switch (tier) {
            case 1:
                mats.put(bh, 5);
                mats.put(rp, 10);
            case 2:
                mats.put(bbh, 5);
                mats.put(bf, 3);
                mats.put(rp, mats.getOrDefault(rp, 0) + 50);
            case 3:
                mats.put(ga, 20);
                mats.put(bg, 3);
                mats.put(blbh, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 200);
            case 4:
                mats.put(ga, mats.getOrDefault(ga, 0) + 30);
                mats.put(bg, mats.getOrDefault(bg, 0) + 5);
                mats.put(sbh, 5);
                mats.put(rp, mats.getOrDefault(rp, 0) + 500);
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
    String pmb = "Mighty Banana";
    String psc = "Swift Carrot";

    String psv = "Swift Violet";
    String pmt = "Mighty Thistle";
    String pws = "Warm Safflina";
    String pcs = "Cool Safflina";
    String pes = "Electric Safflina";
    String pbn = "Blue Nightshade";
    String psp = "Silent Princess";
    String ps = "Sundelion";

    String pff = "Fire Fruit";
    String pif = "Ice Fruit";
    String psf = "Shock Fruit";
    String pdf = "Dazzlefruit";
    ///Mushrooms
    String mr = "Rushroom";
    String mrz = "Razorshroom";
    String ms = "Sunshroom";
    String mc = "Chillshroom";
    String mz = "Zapshroom";
    String mss = "Silent Shroom";
    String mbc = "Brightcap";
    String mp = "Puffshroom";

    ///Fish
    String fhb = "Hyrule Bass";
    String fheb = "Hearty Bass";
    String fst = "Stealthfin Trout";
    String fszt = "Sizzlefin Trout";
    String fct = "Chillfin Trout";
    String fvt = "Voltfin Trout";
    String fgf = "Glowing Cave Fish";

    ///Bugs
    String bsb = "Smotherwing Butterfly";
    String bsub = "Summerwing Butterfly";
    String bwb = "Winterwing Butterfly";
    String btb = "Thunderwing Butterfly";

    String bsf = "Sunset Firefly";
    String bdf = "Deep Firefly";
    String bcbh = "Courser Bee Honey";

    String bwd = "Warm Darner";
    String bcd = "Cold Darner";
    String bed = "Electric Darner";

    String beb = "Energetic Rhino Beetle";
    String bbb = "Bladed Rhino Beetle";

    ///Misc Critters
    String chf = "Hot-footed Frog";
    String csf = "Stick Frog";
    String chl = "Hightail Lizard";
    String chel = "Hearty Lizard";
    String cfl = "Fireproof Lizard";
    String csl = "Sticky Lizard";
    String css = "Sneaky River Snail";
    String crc = "Razorclaw Crab";

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
    String slh = "Silver Lizalfos Horn";
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
    String smh = "Silver Moblin Horn";

    //Horriblin Parts
    String hg = "Horriblin Guts";
    String hh = "Horriblin Horn";
    String bhh = "Blue Horriblin Horn";
    String blhh = "Black Horriblin Horn";

    //Keese Parts
    String ke = "Keese Eyeball";
    String kw = "Keese Wing";
    String fkw = "Fire Keese Wing";
    String ikw = "Ice Keese Wing";
    String ekw = "Electric Keese Wing";

    //Aerocuda Parts
    String aw = "Aerocuda Wing";
    String ae = "Aerocuda Eyeball";

    //Octorok Parts
    String oe = "Octorok Eyeball";
    String ot = "Octorok Tentacle";
    String ob = "Octorok Balloon";

    //Chuchu Parts
    String cj = "Chuchu Jelly";
    String crj = "Red Chuchu Jelly";
    String cwj = "White Chuchu Jelly";
    String cyj = "Yellow Chuchu Jelly";

    //Like Like Parts
    String fls = "Fire Like Stone";
    String ils = "Ice Like Stone";
    String sls = "Shock Like Stone";

    //Gibdo Parts
    String gb = "Gibdo Bone";
    String gg = "Gibdo Guts";
    String gw = "Gibdo Wing";

    //Construct Parts
    String sch = "Soldier Construct I Horn";
    String sch2 = "Soldier Construct II Horn";
    String sch3 = "Soldier Construct III Horn";
    String sch4 = "Soldier Construct IV Horn";

    String cch = "Captain Construct I Horn";
    String cch2 = "Captain Construct II Horn";
    String cch3 = "Captain Construct III Horn";

    //Boss Bokoblin Parts
    String bbf = "Boss Bokoblin Fang";
    String bobh = "Boss Bokoblin Horn";
    String bbbh = "Blue Boss Bokoblin Horn";
    String blbbh = "Black Boss Bokoblin Horn";
    String sbbh = "Silver Boss Bokoblin Horn";


    ///Boss Monster Parts
    //Hinox Parts
    String bhg = "Hinox Guts";
    String bht = "Hinox Toenail";
    String bhto = "Hinox Tooth";
    String bbhh = "Black Hinox Horn";

    //Frox Parts
    String bfg = "Frox Guts";
    String bffn = "Frox Fingernail";
    String bff = "Frox Fang";
    String boff = "Obsidian Frox Fang";
    String bbwff = "Blue-White Frox Fang";

    //Molduga Parts
    String bmj = "Molduga Jaw";
    String bmf = "Molduga Fin";
    String bmg = "Molduga Guts";

    //Lynel Parts
    String blho = "Lynel Hoof";
    String blg = "Lynel Guts";
    String blsh = "Lynel Saber Horn";
    String blmh = "Lynel Mace Horn";
    String bblsh = "Blue-Maned Lynel Saber Horn";
    String bblmh = "Blue-Maned Lynel Mace Horn";
    String bwlsh = "White-Maned Lynel Saber Horn";
    String bwlmh = "White-Maned Lynel Mace Horn";
    String bslsh = "Silver Lynel Saber Horn";
    String bslmh = "Silver Lynel Mace Horn";

    //Gleeok Parts
    String bgw = "Gleeok Wing";
    String bgg = "Gleeok Guts";
    String bgfh = "Gleeok Flame Horn";
    String bgih = "Gleeok Ice Horn";
    String bgth = "Gleeok Thunder Horn";

    ///Gems
    String gf = "Flint";
    String gl = "Luminous Stone";
    String ga = "Amber";
    String go = "Opal";
    String gr = "Ruby";
    String gs = "Sapphire";
    String gt = "Topaz";
    String gd = "Diamond";

    String gz = "Zonaite";
    String glz = "Large Zonaite";

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

    String lds = "Light Dragon's Scale";
    String ldt = "Light Dragon's Talon";
    String ldsp;
    String ldh = "Light Dragon's Horn";
    String ldf = "Shard of Light Dragon's Fang";

    ///Misc
    String sf = "Star Fragment";
    String bs = "Brightbloom Seed";
    String gbs = "Giant Brightbloom Seed";

    String lzc = "Large Zonai Charge";
    String gdc = "Dark Clump";

    String rp = "Rupees";
}
