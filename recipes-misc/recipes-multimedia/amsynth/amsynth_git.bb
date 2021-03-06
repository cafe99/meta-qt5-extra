SUMMARY = "Software synth with a classic subtractive synthesizer topology"
HOMEPAGE = "http://amsynth.github.io/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=67b604758dd265c185ce36fcf76a889d"

inherit autotools pkgconfig gtk-icon-cache gettext

DEPENDS += " \
    gtk+ \
    intltool-native \
"

SRC_URI = "git://github.com/amsynth/amsynth.git;branch=develop"
SRCREV = "3ddbd8c44ea9ddec558c1da0d27b26f553898d4f"
PV = "1.8.0+git${SRCPV}"
S = "${WORKDIR}/git"


PACKAGECONFIG ??= "alsa jack sndfile lv2"

PACKAGECONFIG[oss] = "--with-oss,--without-oss"
PACKAGECONFIG[alsa] = "--with-alsa,--without-alsa,alsa-lib"
PACKAGECONFIG[dssi] = "--with-dssi,--without-dssi,dssi liblo"
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"
PACKAGECONFIG[sndfile] = "--with-sndfile,--without-sndfile,libsndfile1"
PACKAGECONFIG[lv2] = "--with-lv2,--without-lv2,lv2"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
