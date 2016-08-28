
package com.perp.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fingerIndex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fingerIndex">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RIGHT_THUMB"/>
 *     &lt;enumeration value="RIGHT_INDEX"/>
 *     &lt;enumeration value="RIGHT_MIDDLE"/>
 *     &lt;enumeration value="RIGHT_RING"/>
 *     &lt;enumeration value="RIGHT_PINKY"/>
 *     &lt;enumeration value="LEFT_THUMB"/>
 *     &lt;enumeration value="LEFT_INDEX"/>
 *     &lt;enumeration value="LEFT_MIDDLE"/>
 *     &lt;enumeration value="LEFT_RING"/>
 *     &lt;enumeration value="LEFT_PINKY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fingerIndex")
@XmlEnum
public enum FingerIndex {

    RIGHT_THUMB,
    RIGHT_INDEX,
    RIGHT_MIDDLE,
    RIGHT_RING,
    RIGHT_PINKY,
    LEFT_THUMB,
    LEFT_INDEX,
    LEFT_MIDDLE,
    LEFT_RING,
    LEFT_PINKY;

    public String value() {
        return name();
    }

    public static FingerIndex fromValue(String v) {
        return valueOf(v);
    }

}
