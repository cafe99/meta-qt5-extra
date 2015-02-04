SUMMARY = "Library used to query system info and statistics "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

SRCREV = "70f70eb97e5b144a63468ea78b6c436bf43cf571"
PV = "0.2.0+git${SRCPV}"

#EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=''"

CMAKE_HIDE_ERROR[1] = "sysstat-qt5, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "sysstat-qt5, -S${libdir}, -S${STAGING_LIBDIR}"