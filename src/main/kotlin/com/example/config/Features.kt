package com.example.config;

import at.hannibal2.skyhanni.deps.moulconfig.Config;
import at.hannibal2.skyhanni.deps.moulconfig.annotations.Category;
import com.example.ExampleMod;
import com.google.gson.annotations.Expose;

public class Features extends Config {

    @Override
    public boolean shouldAutoFocusSearchbar() {
        return true;
    }

    @Override
    public String getTitle() {
        return ExampleMod.MOD_NAME + " " + ExampleMod.VERSION;
    }

    @Override
    public void saveNow() {
        ExampleMod.Companion.getManagedConfig().saveToFile();
    }

    @Expose
    @Category(name = "Example", desc = "")
    public ExampleCategory exampleCategory = new ExampleCategory();

}
