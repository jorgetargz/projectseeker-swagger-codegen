# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class OfferInfoDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, freelancer_id: str=None, description: str=None, budget: float=None, status: str=None):  # noqa: E501
        """OfferInfoDTO - a model defined in Swagger

        :param freelancer_id: The freelancer_id of this OfferInfoDTO.  # noqa: E501
        :type freelancer_id: str
        :param description: The description of this OfferInfoDTO.  # noqa: E501
        :type description: str
        :param budget: The budget of this OfferInfoDTO.  # noqa: E501
        :type budget: float
        :param status: The status of this OfferInfoDTO.  # noqa: E501
        :type status: str
        """
        self.swagger_types = {
            'freelancer_id': str,
            'description': str,
            'budget': float,
            'status': str
        }

        self.attribute_map = {
            'freelancer_id': 'freelancerId',
            'description': 'description',
            'budget': 'budget',
            'status': 'status'
        }
        self._freelancer_id = freelancer_id
        self._description = description
        self._budget = budget
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'OfferInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferInfoDTO of this OfferInfoDTO.  # noqa: E501
        :rtype: OfferInfoDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def freelancer_id(self) -> str:
        """Gets the freelancer_id of this OfferInfoDTO.


        :return: The freelancer_id of this OfferInfoDTO.
        :rtype: str
        """
        return self._freelancer_id

    @freelancer_id.setter
    def freelancer_id(self, freelancer_id: str):
        """Sets the freelancer_id of this OfferInfoDTO.


        :param freelancer_id: The freelancer_id of this OfferInfoDTO.
        :type freelancer_id: str
        """

        self._freelancer_id = freelancer_id

    @property
    def description(self) -> str:
        """Gets the description of this OfferInfoDTO.


        :return: The description of this OfferInfoDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this OfferInfoDTO.


        :param description: The description of this OfferInfoDTO.
        :type description: str
        """

        self._description = description

    @property
    def budget(self) -> float:
        """Gets the budget of this OfferInfoDTO.


        :return: The budget of this OfferInfoDTO.
        :rtype: float
        """
        return self._budget

    @budget.setter
    def budget(self, budget: float):
        """Sets the budget of this OfferInfoDTO.


        :param budget: The budget of this OfferInfoDTO.
        :type budget: float
        """

        self._budget = budget

    @property
    def status(self) -> str:
        """Gets the status of this OfferInfoDTO.


        :return: The status of this OfferInfoDTO.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this OfferInfoDTO.


        :param status: The status of this OfferInfoDTO.
        :type status: str
        """

        self._status = status