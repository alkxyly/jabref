package net.sf.jabref.ds3;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import net.sf.jabref.external.ExternalFileType;
import net.sf.jabref.external.ExternalFileTypes;

@SuppressWarnings("deprecation")
public class ManageExternalFileTypesTests {

    @SuppressWarnings("deprecation")
    @Test
    public void testGetDefaultExternalFileTypes() {
        List<ExternalFileType> list = ExternalFileTypes.getDefaultExternalFileTypes();
        int tamanho = list.size();
        Assert.assertEquals(23, tamanho);

    }

}
