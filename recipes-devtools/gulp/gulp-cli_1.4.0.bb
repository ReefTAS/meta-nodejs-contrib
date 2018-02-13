SUMMARY = "Command line interface for the Gulp streaming build system"
HOMEPAGE = "http://gulpjs.com/"
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=2823b4b2f2e0f9bae5fa46f1f150c75a"

PACKAGE_ARCH = "all"

SRC_URI = "https://github.com/gulpjs/gulp-cli/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "f42504ab87250af860d4a716d1dccb3e"
SRC_URI[sha256sum] = "027b2e03974958643ad282d359732e42f714c9108a316c456db018c641fa7ed9"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"
