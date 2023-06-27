package de.squeezzy.skywalkersagacharackter.list;

import de.squeezzy.skywalkersagacharackter.armor.Boots;
import de.squeezzy.skywalkersagacharackter.armor.Chestplate;
import de.squeezzy.skywalkersagacharackter.armor.Leggins;
import de.squeezzy.skywalkersagacharackter.heads.Charakter;
import de.squeezzy.skywalkersagacharackter.heads.Heads;

import java.util.ArrayList;

public class CharacterList {
    private  ArrayList<Charakter> characters = new ArrayList<>();
    public CharacterList() {
        characters.add(new Charakter(Heads.getAnakin(),Chestplate.getAnakin(),Leggins.getAnakin(),Boots.getAnakin()));
        characters.add(new Charakter(Heads.getAhsoka(),Chestplate.getAhsoka(),Leggins.getAhsoka(),Boots.getAhsoka()));
        characters.add(new Charakter(Heads.getLuke(),Chestplate.getLuke(),Leggins.getLuke(),Boots.getLuke()));
        characters.add(new Charakter(Heads.getYoda(),Chestplate.getYoda(),Leggins.getYoda(),Boots.getYoda()));
        characters.add(new Charakter(Heads.getRey(),Chestplate.getRey(),Leggins.getRey(),Boots.getRey()));
        characters.add(new Charakter(Heads.getLeia(),Chestplate.getLeia(),Leggins.getLeia(),Boots.getLeia()));
        characters.add(new Charakter(Heads.getJarJar(),Chestplate.getJarJar(),Leggins.getJarJar(),Boots.getJarJar()));
        characters.add(new Charakter(Heads.getEwok(),Chestplate.getEwok(),Leggins.getEwok(),Boots.getEwok()));
        characters.add(new Charakter(Heads.getRebelPilot(),Chestplate.getRebelPilot(),Leggins.getRebelPilot(),Boots.getRebelPilot()));
        characters.add(new Charakter(Heads.getRebelHoth(),Chestplate.getRebelHoth(),Leggins.getRebelHoth(),Boots.getRebelHoth()));
        characters.add(new Charakter(Heads.getReySchrott(),Chestplate.getReySchrott(),Leggins.getReySchrott(),Boots.getReySchrott()));
        characters.add(new Charakter(Heads.getJawa(),Chestplate.getJawa(),Leggins.getJawa(),Boots.getJawa()));
        characters.add(new Charakter(Heads.getTusken(),Chestplate.getTusken(),Leggins.getTusken(),Boots.getTusken()));
        characters.add(new Charakter(Heads.getWicket(),Chestplate.getWicket(),Leggins.getWicket(),Boots.getWicket()));
        characters.add(new Charakter(Heads.getChiefChirpa(),Chestplate.getChiefChirpa(),Leggins.getChiefChirpa(),Boots.getChiefChirpa()));
        characters.add(new Charakter(Heads.getHanSolo(),Chestplate.getHanSolo(),Leggins.getHanSolo(),Boots.getHanSolo()));
        characters.add(new Charakter(Heads.getChewbacca(),Chestplate.getChewbacca(),Leggins.getChewbacca(),Boots.getChewbacca()));
        characters.add(new Charakter(Heads.getWookie(),Chestplate.getWookie(),Leggins.getWookie(),Boots.getWookie()));
        characters.add(new Charakter(Heads.getBobaFett(),Chestplate.getBobaFett(),Leggins.getBobaFett(),Boots.getBobaFett()));
        characters.add(new Charakter(Heads.getHondo(),Chestplate.getHondo(),Leggins.getHondo(),Boots.getHondo()));
        characters.add(new Charakter(Heads.getJabba(),Chestplate.getJabba(),Leggins.getJabba(),Boots.getJabba()));
        characters.add(new Charakter(Heads.getTarkin(),Chestplate.getTarkin(),Leggins.getTarkin(),Boots.getTarkin()));
        characters.add(new Charakter(Heads.getVader(),Chestplate.getVader(),Leggins.getVader(),Boots.getVader()));
        characters.add(new Charakter(Heads.getR2D2(),Chestplate.getR2D2(),Leggins.getR2D2(),Boots.getR2D2()));
        characters.add(new Charakter(Heads.getC3PO(),Chestplate.getC3PO(),Leggins.getC3PO(),Boots.getC3PO()));

    }

    public ArrayList<Charakter> getCharacters() {
        return characters;
    }
}
