package de.halirutan.spectralis;

import de.halirutan.spectralis.filestructure.BScanVersion;
import de.halirutan.spectralis.filestructure.HSFVersion;

public class UnsupportedVersionException extends SpectralisException {
    private static final String REQUIRES_AT_LEAST = "Requires at least ";

    public UnsupportedVersionException(HSFVersion shouldBe) {
        super(REQUIRES_AT_LEAST + shouldBe);
    }

    public UnsupportedVersionException(BScanVersion shouldBe) {
        super(REQUIRES_AT_LEAST + shouldBe);
    }
}
