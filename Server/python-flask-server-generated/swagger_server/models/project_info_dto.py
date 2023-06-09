# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.offer_info_dto import OfferInfoDTO  # noqa: F401,E501
from swagger_server import util


class ProjectInfoDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, id: str=None, client_id: str=None, title: str=None, description: str=None, skills: List[str]=None, min_budget: float=None, max_budget: float=None, start_date: date=None, deadline_date: date=None, real_end_date: date=None, status: str=None, selected_freelancer_id: str=None, offers: List[OfferInfoDTO]=None):  # noqa: E501
        """ProjectInfoDTO - a model defined in Swagger

        :param id: The id of this ProjectInfoDTO.  # noqa: E501
        :type id: str
        :param client_id: The client_id of this ProjectInfoDTO.  # noqa: E501
        :type client_id: str
        :param title: The title of this ProjectInfoDTO.  # noqa: E501
        :type title: str
        :param description: The description of this ProjectInfoDTO.  # noqa: E501
        :type description: str
        :param skills: The skills of this ProjectInfoDTO.  # noqa: E501
        :type skills: List[str]
        :param min_budget: The min_budget of this ProjectInfoDTO.  # noqa: E501
        :type min_budget: float
        :param max_budget: The max_budget of this ProjectInfoDTO.  # noqa: E501
        :type max_budget: float
        :param start_date: The start_date of this ProjectInfoDTO.  # noqa: E501
        :type start_date: date
        :param deadline_date: The deadline_date of this ProjectInfoDTO.  # noqa: E501
        :type deadline_date: date
        :param real_end_date: The real_end_date of this ProjectInfoDTO.  # noqa: E501
        :type real_end_date: date
        :param status: The status of this ProjectInfoDTO.  # noqa: E501
        :type status: str
        :param selected_freelancer_id: The selected_freelancer_id of this ProjectInfoDTO.  # noqa: E501
        :type selected_freelancer_id: str
        :param offers: The offers of this ProjectInfoDTO.  # noqa: E501
        :type offers: List[OfferInfoDTO]
        """
        self.swagger_types = {
            'id': str,
            'client_id': str,
            'title': str,
            'description': str,
            'skills': List[str],
            'min_budget': float,
            'max_budget': float,
            'start_date': date,
            'deadline_date': date,
            'real_end_date': date,
            'status': str,
            'selected_freelancer_id': str,
            'offers': List[OfferInfoDTO]
        }

        self.attribute_map = {
            'id': 'id',
            'client_id': 'clientId',
            'title': 'title',
            'description': 'description',
            'skills': 'skills',
            'min_budget': 'minBudget',
            'max_budget': 'maxBudget',
            'start_date': 'startDate',
            'deadline_date': 'deadlineDate',
            'real_end_date': 'realEndDate',
            'status': 'status',
            'selected_freelancer_id': 'selectedFreelancerId',
            'offers': 'offers'
        }
        self._id = id
        self._client_id = client_id
        self._title = title
        self._description = description
        self._skills = skills
        self._min_budget = min_budget
        self._max_budget = max_budget
        self._start_date = start_date
        self._deadline_date = deadline_date
        self._real_end_date = real_end_date
        self._status = status
        self._selected_freelancer_id = selected_freelancer_id
        self._offers = offers

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectInfoDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectInfoDTO of this ProjectInfoDTO.  # noqa: E501
        :rtype: ProjectInfoDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this ProjectInfoDTO.


        :return: The id of this ProjectInfoDTO.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ProjectInfoDTO.


        :param id: The id of this ProjectInfoDTO.
        :type id: str
        """

        self._id = id

    @property
    def client_id(self) -> str:
        """Gets the client_id of this ProjectInfoDTO.


        :return: The client_id of this ProjectInfoDTO.
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id: str):
        """Sets the client_id of this ProjectInfoDTO.


        :param client_id: The client_id of this ProjectInfoDTO.
        :type client_id: str
        """

        self._client_id = client_id

    @property
    def title(self) -> str:
        """Gets the title of this ProjectInfoDTO.


        :return: The title of this ProjectInfoDTO.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ProjectInfoDTO.


        :param title: The title of this ProjectInfoDTO.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ProjectInfoDTO.


        :return: The description of this ProjectInfoDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ProjectInfoDTO.


        :param description: The description of this ProjectInfoDTO.
        :type description: str
        """

        self._description = description

    @property
    def skills(self) -> List[str]:
        """Gets the skills of this ProjectInfoDTO.


        :return: The skills of this ProjectInfoDTO.
        :rtype: List[str]
        """
        return self._skills

    @skills.setter
    def skills(self, skills: List[str]):
        """Sets the skills of this ProjectInfoDTO.


        :param skills: The skills of this ProjectInfoDTO.
        :type skills: List[str]
        """

        self._skills = skills

    @property
    def min_budget(self) -> float:
        """Gets the min_budget of this ProjectInfoDTO.


        :return: The min_budget of this ProjectInfoDTO.
        :rtype: float
        """
        return self._min_budget

    @min_budget.setter
    def min_budget(self, min_budget: float):
        """Sets the min_budget of this ProjectInfoDTO.


        :param min_budget: The min_budget of this ProjectInfoDTO.
        :type min_budget: float
        """

        self._min_budget = min_budget

    @property
    def max_budget(self) -> float:
        """Gets the max_budget of this ProjectInfoDTO.


        :return: The max_budget of this ProjectInfoDTO.
        :rtype: float
        """
        return self._max_budget

    @max_budget.setter
    def max_budget(self, max_budget: float):
        """Sets the max_budget of this ProjectInfoDTO.


        :param max_budget: The max_budget of this ProjectInfoDTO.
        :type max_budget: float
        """

        self._max_budget = max_budget

    @property
    def start_date(self) -> date:
        """Gets the start_date of this ProjectInfoDTO.


        :return: The start_date of this ProjectInfoDTO.
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: date):
        """Sets the start_date of this ProjectInfoDTO.


        :param start_date: The start_date of this ProjectInfoDTO.
        :type start_date: date
        """

        self._start_date = start_date

    @property
    def deadline_date(self) -> date:
        """Gets the deadline_date of this ProjectInfoDTO.


        :return: The deadline_date of this ProjectInfoDTO.
        :rtype: date
        """
        return self._deadline_date

    @deadline_date.setter
    def deadline_date(self, deadline_date: date):
        """Sets the deadline_date of this ProjectInfoDTO.


        :param deadline_date: The deadline_date of this ProjectInfoDTO.
        :type deadline_date: date
        """

        self._deadline_date = deadline_date

    @property
    def real_end_date(self) -> date:
        """Gets the real_end_date of this ProjectInfoDTO.


        :return: The real_end_date of this ProjectInfoDTO.
        :rtype: date
        """
        return self._real_end_date

    @real_end_date.setter
    def real_end_date(self, real_end_date: date):
        """Sets the real_end_date of this ProjectInfoDTO.


        :param real_end_date: The real_end_date of this ProjectInfoDTO.
        :type real_end_date: date
        """

        self._real_end_date = real_end_date

    @property
    def status(self) -> str:
        """Gets the status of this ProjectInfoDTO.


        :return: The status of this ProjectInfoDTO.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this ProjectInfoDTO.


        :param status: The status of this ProjectInfoDTO.
        :type status: str
        """

        self._status = status

    @property
    def selected_freelancer_id(self) -> str:
        """Gets the selected_freelancer_id of this ProjectInfoDTO.


        :return: The selected_freelancer_id of this ProjectInfoDTO.
        :rtype: str
        """
        return self._selected_freelancer_id

    @selected_freelancer_id.setter
    def selected_freelancer_id(self, selected_freelancer_id: str):
        """Sets the selected_freelancer_id of this ProjectInfoDTO.


        :param selected_freelancer_id: The selected_freelancer_id of this ProjectInfoDTO.
        :type selected_freelancer_id: str
        """

        self._selected_freelancer_id = selected_freelancer_id

    @property
    def offers(self) -> List[OfferInfoDTO]:
        """Gets the offers of this ProjectInfoDTO.


        :return: The offers of this ProjectInfoDTO.
        :rtype: List[OfferInfoDTO]
        """
        return self._offers

    @offers.setter
    def offers(self, offers: List[OfferInfoDTO]):
        """Sets the offers of this ProjectInfoDTO.


        :param offers: The offers of this ProjectInfoDTO.
        :type offers: List[OfferInfoDTO]
        """

        self._offers = offers
