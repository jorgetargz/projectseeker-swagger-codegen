# coding: utf-8

"""
    Project Seeker API

    Project Seeker API  # noqa: E501

    OpenAPI spec version: 1.0
    Contact: jorgetargz@gmail.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class AssignProjectDTO(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'project_id': 'str',
        'freelancer_id': 'str'
    }

    attribute_map = {
        'project_id': 'projectId',
        'freelancer_id': 'freelancerId'
    }

    def __init__(self, project_id=None, freelancer_id=None):  # noqa: E501
        """AssignProjectDTO - a model defined in Swagger"""  # noqa: E501
        self._project_id = None
        self._freelancer_id = None
        self.discriminator = None
        if project_id is not None:
            self.project_id = project_id
        if freelancer_id is not None:
            self.freelancer_id = freelancer_id

    @property
    def project_id(self):
        """Gets the project_id of this AssignProjectDTO.  # noqa: E501


        :return: The project_id of this AssignProjectDTO.  # noqa: E501
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """Sets the project_id of this AssignProjectDTO.


        :param project_id: The project_id of this AssignProjectDTO.  # noqa: E501
        :type: str
        """

        self._project_id = project_id

    @property
    def freelancer_id(self):
        """Gets the freelancer_id of this AssignProjectDTO.  # noqa: E501


        :return: The freelancer_id of this AssignProjectDTO.  # noqa: E501
        :rtype: str
        """
        return self._freelancer_id

    @freelancer_id.setter
    def freelancer_id(self, freelancer_id):
        """Sets the freelancer_id of this AssignProjectDTO.


        :param freelancer_id: The freelancer_id of this AssignProjectDTO.  # noqa: E501
        :type: str
        """

        self._freelancer_id = freelancer_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(AssignProjectDTO, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, AssignProjectDTO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
