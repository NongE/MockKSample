package com.project.mockksample

import junit.framework.Assert.assertEquals
import org.junit.Test

internal class IsBigKtTest {
    @Test
    fun isNotBigTest() {
        assertEquals(false, isBig(10))
    }

    @Test
    fun isBigTest() {
        assertEquals(true, isBig(51))
    }
}