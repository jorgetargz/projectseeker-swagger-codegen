# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class ErrorDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, timestamp: datetime=None, http_error_code: int=None, firebase_error: str=None, message: str=None, description: str=None):  # noqa: E501
        """ErrorDTO - a model defined in Swagger

        :param timestamp: The timestamp of this ErrorDTO.  # noqa: E501
        :type timestamp: datetime
        :param http_error_code: The http_error_code of this ErrorDTO.  # noqa: E501
        :type http_error_code: int
        :param firebase_error: The firebase_error of this ErrorDTO.  # noqa: E501
        :type firebase_error: str
        :param message: The message of this ErrorDTO.  # noqa: E501
        :type message: str
        :param description: The description of this ErrorDTO.  # noqa: E501
        :type description: str
        """
        self.swagger_types = {
            'timestamp': datetime,
            'http_error_code': int,
            'firebase_error': str,
            'message': str,
            'description': str
        }

        self.attribute_map = {
            'timestamp': 'timestamp',
            'http_error_code': 'httpErrorCode',
            'firebase_error': 'firebaseError',
            'message': 'message',
            'description': 'description'
        }
        self._timestamp = timestamp
        self._http_error_code = http_error_code
        self._firebase_error = firebase_error
        self._message = message
        self._description = description

    @classmethod
    def from_dict(cls, dikt) -> 'ErrorDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ErrorDTO of this ErrorDTO.  # noqa: E501
        :rtype: ErrorDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def timestamp(self) -> datetime:
        """Gets the timestamp of this ErrorDTO.


        :return: The timestamp of this ErrorDTO.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp: datetime):
        """Sets the timestamp of this ErrorDTO.


        :param timestamp: The timestamp of this ErrorDTO.
        :type timestamp: datetime
        """

        self._timestamp = timestamp

    @property
    def http_error_code(self) -> int:
        """Gets the http_error_code of this ErrorDTO.


        :return: The http_error_code of this ErrorDTO.
        :rtype: int
        """
        return self._http_error_code

    @http_error_code.setter
    def http_error_code(self, http_error_code: int):
        """Sets the http_error_code of this ErrorDTO.


        :param http_error_code: The http_error_code of this ErrorDTO.
        :type http_error_code: int
        """

        self._http_error_code = http_error_code

    @property
    def firebase_error(self) -> str:
        """Gets the firebase_error of this ErrorDTO.


        :return: The firebase_error of this ErrorDTO.
        :rtype: str
        """
        return self._firebase_error

    @firebase_error.setter
    def firebase_error(self, firebase_error: str):
        """Sets the firebase_error of this ErrorDTO.


        :param firebase_error: The firebase_error of this ErrorDTO.
        :type firebase_error: str
        """

        self._firebase_error = firebase_error

    @property
    def message(self) -> str:
        """Gets the message of this ErrorDTO.


        :return: The message of this ErrorDTO.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this ErrorDTO.


        :param message: The message of this ErrorDTO.
        :type message: str
        """

        self._message = message

    @property
    def description(self) -> str:
        """Gets the description of this ErrorDTO.


        :return: The description of this ErrorDTO.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ErrorDTO.


        :param description: The description of this ErrorDTO.
        :type description: str
        """

        self._description = description