# coding: utf-8

"""
    Project Seeker API

    Project Seeker API  # noqa: E501

    OpenAPI spec version: 1.0
    Contact: jorgetargz@gmail.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from setuptools import setup, find_packages  # noqa: H301

NAME = "swagger-client"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Project Seeker API",
    author_email="jorgetargz@gmail.com",
    url="",
    keywords=["Swagger", "Project Seeker API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    Project Seeker API  # noqa: E501
    """
)