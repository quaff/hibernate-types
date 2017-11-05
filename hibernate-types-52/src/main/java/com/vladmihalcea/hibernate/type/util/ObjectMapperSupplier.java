package com.vladmihalcea.hibernate.type.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Supplies a custom reference of a Jackson {@link ObjectMapper}
 *
 * @author Vlad Mihalcea
 * @since 1.1.2
 */
public interface ObjectMapperSupplier {

    /**
     * Get custom {@link ObjectMapper} reference
     *
     * @return custom {@link ObjectMapper} reference
     */
    ObjectMapper get();
}
