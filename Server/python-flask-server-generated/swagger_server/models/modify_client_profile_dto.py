# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ModifyClientProfileDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, title: str=None, description: str=None):  # noqa: E501
        """ModifyClientProfileDTO - a model defined in Swagger

        :param title: The title of this ModifyClientProfileDTO.  # noqa: E501
        :type title: str
        :param description: The description of this ModifyClientProfileDTO.  # noqa: E501
        :type description: str
        """
        self.swagger_types = {
            'title': str,
            'description': str
        }

        self.attribute_map = {
            'title': 'title',
            'description': 'description'
        }
        self._title = title
        self._description = description

    @classmethod
    def from_dict(cls, dikt) -> 'ModifyClientProfileDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ModifyClientProfileDTO of this ModifyClientProfileDTO.  # noqa: E501
        :rtype: ModifyClientProfileDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def title(self) -> str:
        """Gets the title of this ModifyClientProfileDTO.


        :return: The title of this ModifyClientProfileDTO.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ModifyClientProfileDTO.


        :param title: The title of this ModifyClientProfileDTO.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ModifyClientProfileDTO.


        :return: The description of this ModifyClientProfileDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ModifyClientProfileDTO.


        :param description: The description of this ModifyClientProfileDTO.
        :type description: str
        """

        self._description = description