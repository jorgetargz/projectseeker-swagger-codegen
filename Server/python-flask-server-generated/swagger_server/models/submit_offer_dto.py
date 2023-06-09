# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class SubmitOfferDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, project_id: str=None, description: str=None, budget: float=None):  # noqa: E501
        """SubmitOfferDTO - a model defined in Swagger

        :param project_id: The project_id of this SubmitOfferDTO.  # noqa: E501
        :type project_id: str
        :param description: The description of this SubmitOfferDTO.  # noqa: E501
        :type description: str
        :param budget: The budget of this SubmitOfferDTO.  # noqa: E501
        :type budget: float
        """
        self.swagger_types = {
            'project_id': str,
            'description': str,
            'budget': float
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'description': 'description',
            'budget': 'budget'
        }
        self._project_id = project_id
        self._description = description
        self._budget = budget

    @classmethod
    def from_dict(cls, dikt) -> 'SubmitOfferDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SubmitOfferDTO of this SubmitOfferDTO.  # noqa: E501
        :rtype: SubmitOfferDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def project_id(self) -> str:
        """Gets the project_id of this SubmitOfferDTO.


        :return: The project_id of this SubmitOfferDTO.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id: str):
        """Sets the project_id of this SubmitOfferDTO.


        :param project_id: The project_id of this SubmitOfferDTO.
        :type project_id: str
        """

        self._project_id = project_id

    @property
    def description(self) -> str:
        """Gets the description of this SubmitOfferDTO.


        :return: The description of this SubmitOfferDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this SubmitOfferDTO.


        :param description: The description of this SubmitOfferDTO.
        :type description: str
        """

        self._description = description

    @property
    def budget(self) -> float:
        """Gets the budget of this SubmitOfferDTO.


        :return: The budget of this SubmitOfferDTO.
        :rtype: float
        """
        return self._budget

    @budget.setter
    def budget(self, budget: float):
        """Sets the budget of this SubmitOfferDTO.


        :param budget: The budget of this SubmitOfferDTO.
        :type budget: float
        """

        self._budget = budget
