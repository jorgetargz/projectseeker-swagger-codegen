import connexion
import six

from swagger_server.models.error_dto import ErrorDTO  # noqa: E501
from swagger_server.models.profile_dto import ProfileDTO  # noqa: E501
from swagger_server import util


def disable_user(email):  # noqa: E501
    """Disable user

     # noqa: E501

    :param email: 
    :type email: str

    :rtype: None
    """
    return 'do some magic!'


def enable_user(email):  # noqa: E501
    """Enable user

     # noqa: E501

    :param email: 
    :type email: str

    :rtype: None
    """
    return 'do some magic!'


def get_user_by_email(email):  # noqa: E501
    """Get user by email

     # noqa: E501

    :param email: 
    :type email: str

    :rtype: ProfileDTO
    """
    return 'do some magic!'
