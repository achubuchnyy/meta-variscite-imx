# Copyright (C) 2015 Packt Publishing.

SUMMARY = "Simplest hello world kernel module."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

PR = "r0"

SRC_URI = " \
        file://l3g4200d.c \
        file://Makefile \
        "

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "(var-som-mx6|imx6ul-var-dart|imx7-var-som|imx6ul-charge)"
