<?php
/**
 * CreateProjectDTO
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Project Seeker API
 *
 * Project Seeker API
 *
 * OpenAPI spec version: 1.0
 * Contact: jorgetargz@gmail.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 3.0.42
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * CreateProjectDTO Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CreateProjectDTO implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'CreateProjectDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'title' => 'string',
'description' => 'string',
'skills' => 'string[]',
'min_budget' => 'double',
'max_budget' => 'double',
'start_date' => '\DateTime',
'deadline_date' => '\DateTime'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'title' => null,
'description' => null,
'skills' => null,
'min_budget' => 'double',
'max_budget' => 'double',
'start_date' => 'date',
'deadline_date' => 'date'    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'title' => 'title',
'description' => 'description',
'skills' => 'skills',
'min_budget' => 'minBudget',
'max_budget' => 'maxBudget',
'start_date' => 'startDate',
'deadline_date' => 'deadlineDate'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'title' => 'setTitle',
'description' => 'setDescription',
'skills' => 'setSkills',
'min_budget' => 'setMinBudget',
'max_budget' => 'setMaxBudget',
'start_date' => 'setStartDate',
'deadline_date' => 'setDeadlineDate'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'title' => 'getTitle',
'description' => 'getDescription',
'skills' => 'getSkills',
'min_budget' => 'getMinBudget',
'max_budget' => 'getMaxBudget',
'start_date' => 'getStartDate',
'deadline_date' => 'getDeadlineDate'    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['title'] = isset($data['title']) ? $data['title'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['skills'] = isset($data['skills']) ? $data['skills'] : null;
        $this->container['min_budget'] = isset($data['min_budget']) ? $data['min_budget'] : null;
        $this->container['max_budget'] = isset($data['max_budget']) ? $data['max_budget'] : null;
        $this->container['start_date'] = isset($data['start_date']) ? $data['start_date'] : null;
        $this->container['deadline_date'] = isset($data['deadline_date']) ? $data['deadline_date'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string $title title
     *
     * @return $this
     */
    public function setTitle($title)
    {
        $this->container['title'] = $title;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string $description description
     *
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets skills
     *
     * @return string[]
     */
    public function getSkills()
    {
        return $this->container['skills'];
    }

    /**
     * Sets skills
     *
     * @param string[] $skills skills
     *
     * @return $this
     */
    public function setSkills($skills)
    {
        $this->container['skills'] = $skills;

        return $this;
    }

    /**
     * Gets min_budget
     *
     * @return double
     */
    public function getMinBudget()
    {
        return $this->container['min_budget'];
    }

    /**
     * Sets min_budget
     *
     * @param double $min_budget min_budget
     *
     * @return $this
     */
    public function setMinBudget($min_budget)
    {
        $this->container['min_budget'] = $min_budget;

        return $this;
    }

    /**
     * Gets max_budget
     *
     * @return double
     */
    public function getMaxBudget()
    {
        return $this->container['max_budget'];
    }

    /**
     * Sets max_budget
     *
     * @param double $max_budget max_budget
     *
     * @return $this
     */
    public function setMaxBudget($max_budget)
    {
        $this->container['max_budget'] = $max_budget;

        return $this;
    }

    /**
     * Gets start_date
     *
     * @return \DateTime
     */
    public function getStartDate()
    {
        return $this->container['start_date'];
    }

    /**
     * Sets start_date
     *
     * @param \DateTime $start_date start_date
     *
     * @return $this
     */
    public function setStartDate($start_date)
    {
        $this->container['start_date'] = $start_date;

        return $this;
    }

    /**
     * Gets deadline_date
     *
     * @return \DateTime
     */
    public function getDeadlineDate()
    {
        return $this->container['deadline_date'];
    }

    /**
     * Sets deadline_date
     *
     * @param \DateTime $deadline_date deadline_date
     *
     * @return $this
     */
    public function setDeadlineDate($deadline_date)
    {
        $this->container['deadline_date'] = $deadline_date;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    #[\ReturnTypeWillChange]
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    #[\ReturnTypeWillChange]
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    #[\ReturnTypeWillChange]
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}
