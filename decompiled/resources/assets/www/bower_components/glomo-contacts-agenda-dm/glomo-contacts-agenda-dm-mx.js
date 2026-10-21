/*global GlomoContactsAgendaDm*/
class GlomoContactsAgendaDmMx extends GlomoContactsAgendaDm.mixin(Polymer.mixinBehaviors([], Polymer.Element)) {

  static get is() {
    return 'glomo-contacts-agenda-dm-mx';
  }

  static get properties() {
    return {

      /**
       * Show contacts and products if true
       */
      extendContacts: {
        type: Boolean,
        value: false
      },

      /**
       * Indicates if the deleted item is a product if true
       */
      isProduct: {
        type: Boolean,
        value: false
      },

      /**
       * * Text for no saved contacts screen
       */
      noContactsMessage: {
        type: String,
        value: 'cells-contacts-agenda-no-contacts-message'
      },

      /**
       * Flag to contacts for mobile top up
       */
      mobiles: {
        type: Boolean,
        value: false
      },

      /**
       * Number of contacts to go back form service
       */
      contactsPageSize: {
        type: Number,
        value: 0
      },
      /**
       * Indicates when stand in mode its on
       */
      standIn: {
        type: Boolean,
        value: false
      },
      /**
       * Authentication type for contacts book request
       */
      authenticationType: {
        type: String
      },
      /**
       * Customer device id
       */
      deviceId: {
        type: String
      },
      /**
       * Stores the project name
       */
      projectNameGlomo: {
        type: String,
        value: ''
      },
      /**
       * Stores the project name for standin mode
       */
      projectNameGlomoAlwaysOn: {
        type: String,
        value: ''
      },
      /**
       * Indicates whether the authentication headers are set in stand in mode
       */
      setStandInHeaders: {
        type: Boolean,
        value: false
      },
      /**
       * set the contacts list from service
       */
      contactsResponse: {
        type: Array,
        value: () => []
      },
      /**
       * Indicates if glomo is in spherica mode
       * @type {Boolean}
       * @default false
       */
      isSpherica: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Sets customer device id
   * @param {Object} deviceIdInfo
   */
  setDeviceId(deviceIdInfo) {
    this.deviceId = deviceIdInfo.secondaryUserId ?? deviceIdInfo.value;
  }

  /**
   * Send image, title and message if there any contacts in agenda
   * @override
   */
  _sendInfoNoContacts() {
    const info = {
      message: this.noContactsMessage,
      image: this.noContactsImg
    };
    this._dispatchCustomEvent('no-contacts-saved', info);
  }

  /**
   * Reset not found info when the search result is empty
   */
  _resetNotFoundInfo() {
    this._dispatchCustomEvent('reset-not-found-info', {});
  }

  /**
   * Reset search input value
   */
  resetValue() {
    this._dispatchCustomEvent('search-input-reset-value', '');
  }

  resetContacts() {
    this.contactsResponse = [];
    this._rawContacts = [];
    this.resetValue();
    this.parseContacts();
    this._dispatchCustomEvent('back-to-transfers');
  }

  /**
   * Parses contacts info received from global-apis
   * to show in visual component
   * @param {Array} newContacts
   * @override
   */
  parseContacts(newContacts) {
    let isArray = Array.isArray(newContacts);
    this._resetNotFoundInfo();
    if (isArray && !this._rawContacts.length) {
      this._sendInfoNoContacts();
    }
    this.set('contactsResponse', newContacts);
    let rawContacts = isArray ? this._rawContacts = this._getUniqueContacts(newContacts) : this._rawContacts;
    const letterGroupedContacts = rawContacts.reduce(this._contactsReducer.bind(this), {});
    this.parsedContacts = this._getGroupedContactsArray(letterGroupedContacts);
    this.parsedContacts.forEach(contact => contact.indexGroup = contact.indexGroup.toUpperCase());
    setTimeout(() => {
      this.closeVeil();
    }, 500);
  }

  _getGroupedContactsArray(groupedContactsObj) {
    if (Object.keys(groupedContactsObj)?.length === 0) {
      return [];
    }
    return Object.keys(groupedContactsObj).map(letter => ({
      indexGroup: letter,
      groupItem: this.mobiles ? groupedContactsObj[letter].filter(contact => this._hasNumbersContacts(contact)).map(contact => this._parseContactWithNumber(contact)) : groupedContactsObj[letter].map(contact => this._parseContact(contact)).filter(el => el?.products)
    })).filter(el => !!el?.groupItem?.length);
  }

  /**
  * Filters mobiles contacts
  * @param {Object} contact
  */
  _hasNumbersContacts(contact) {
    return this.c(contact, 'contactsInformation') ? this.c(contact, 'contactsInformation').filter(contactInfo => this.c(contactInfo, 'contactType.id') === 'MOBILE_NUMBER') : false;
  }

  /**
   * Get number with mx format
   * @param {String} number
   * @returns {String}
   */
  _getFormattedPhoneNumber(number) {
    const regexPhone = /(\d{2})(\d{4})(\d{4})/g;
    return number.replace(regexPhone, '$1 $2 $3');
  }

  /**
   * Get company name to lower case with fist letter
   * @param {*} contact
   * @returns {String}
   */
  _getFormattedCompanyName(company) {
    return company ? company.toLowerCase().replace(/^./, (match) => match.toUpperCase()) : '';
  }

  /**
   * Parses contact to show in UI component
   * @param {Object} contact
   */
  _parseContactWithNumber(contact) {
    return {
      id: this.c(contact, 'contactId', ''),
      itemTitle: this.c(contact, 'alias', ''),
      itemSubtitle: this.c(contact, 'person.firstName', ' ') + ' ' + this.c(contact, 'person.lastName', ' '),
      phoneList: this.c(contact, 'contactsInformation', []).map((item, index) => {
        return {
          contactsInformationId: this.c(item, 'contactInformationId'),
          key: this._getFormattedPhoneNumber(this.get('value', item)),
          value: this._getFormattedCompanyName(this.get('contactType.mobileCompany.name', item)),
          idProvider: this.c(item, 'contactType.mobileCompany.id'),
          alias: this.t('glomo-contacts-agenda-phone', '', { numberPhone: (index + 1)})
        };
      }),
      hasActions: !this.isSpherica,
      hasActionsPhoneList: this.isSpherica
    };
  }

  /**
   * Parses contact to show in UI component
   * @override
   * @param {Object} contact
   */
  _parseContact(contact) {
    let contactId = this.c(contact, 'contactId', '');
    let itemSubtitle = this.c(contact, 'person.firstName', ' ') + ' ' + this.c(contact, 'person.lastName', ' ');
    let itemTitle = this.c(contact, 'alias', '');
    let contactInfo = {id: contactId, itemTitle: itemTitle, itemSubtitle: itemSubtitle, hasActions: !this.isSpherica };
    let products = {products: this.c(contact, 'products') ? this.c(contact, 'products').map(product => this._parseProduct(product, contactInfo)) : ''};

    if (!this.extendContacts) {
      return contactInfo;
    } else {
      return Object.assign(contactInfo, products);
    }
  }

  /**
   * Parses contact to show in UI component
   * @param String contactId
   * @param String product
   */
  /* eslint-disable complexity */
  _parseProduct(product, contactInfo) {
    const noData = 'NA';
    const [productType, bankName, number, bank, bbvaBankName] = [product?.numberType?.id, product?.bank?.name ?? noData, this.c(product, 'number') ?? noData, product?.bank?.name ?? noData, 'BBVA'];
    const mapKey = `${product?.numberType?.id} ${product?.specificProductType?.id || product?.productType?.id || ''} ${product.operatives?.[0]?.id ?? ''}`;
    const formatedNumber = bankName === bbvaBankName && productType === 'CCC' ? number.substring(number.length - 10, number.length) : number;
    let parseProduct = {
      numberLabel: formatedNumber,
      contactId: this.c(contactInfo, 'id'),
      itemTitle: contactInfo?.itemTitle.trim().length ? contactInfo.itemTitle : 'Sin Alias',
      itemSubtitle: contactInfo?.itemSubtitle.trim().length ? contactInfo.itemSubtitle : 'Sin nombre',
      productId: this.c(product, 'productId'),
      number: formatedNumber,
      completeNumber: number,
      alias: this.getProductDescriptionByKey(mapKey.trim(), bank, noData),
      bank: this.c(product, 'bank'),
      numberType: this.c(product, 'numberType'),
      operatives: this.c(product, 'operatives'),
      productType: this.c(product, 'productType'),
      hasActions: this.isSpherica,
    };

    this._specificProductType(product, parseProduct);
    return parseProduct;
  }
  /* eslint-enable complexity */

  /**
   * Method for get specific product type
   * @param String product
   */
  _specificProductType(product, parseProduct) {
    if (this.get('specificProductType', product)) {
      parseProduct.specificProductType = this.get('specificProductType', product);
    }
  }

  getProductDescriptionByKey(productKey, bank, noDataValue = '') {
    const description = bank ?? noDataValue;
    const productDescriptionMap = {
      'CLABE ACCOUNT': `CLABE ${description}`,
      'CCC ACCOUNT INTERNAL_TRANSFER': 'Cuenta BBVA',
      'CLABE ACCOUNT INTERBANK_TRANSFER': `CLABE ${description}`,
      'CLABE CLABE': `CLABE ${description}`,
      'SPEI SPEI': `SPEI ${description}`,
      'PAN CREDIT_CARD INTERBANK_TRANSFER': `Tarjeta de crédito ${description}`,
      'PAN DEBIT_CARD INTERBANK_TRANSFER': `Tarjeta de débito ${description}`,
      'PAN CREDIT_CARD INTERNAL_TRANSFER': 'Tarjeta de crédito BBVA',
      'PAN PREPAID_CARD INTERNAL_TRANSFER': `Tarjeta de prepago ${description}`,
      'CCC ACCOUNT': 'Cuenta BBVA',
      'PAN DEBIT_CARD INTERNAL_TRANSFER': 'Tarjeta de débito BBVA',
      'LIC ACCOUNT': 'Cuenta BBVA',
      'SPEI DEBIT_CARD INTERBANK_TRANSFER': `Tarjeta de débito ${description}`,
      'CLABE CLABE INTERBANK_TRANSFER': `CLABE ${description}`,
      'PAN CREDIT_CARD': `Tarjeta de crédito ${description}`,
      'SPEI ACCOUNT INTERBANK_TRANSFER': `SPEI ${description}`
    };
    return productDescriptionMap[productKey];
  }

  /**
   * Get contacts and products list if noContactsMessage flag is true
   * @override
   * @event contacts-list-request-headers
   */
  getContacts() {
    let params;
    const body = {
      expand: 'products'
    };

    if (this.extendContacts && this.contactsPageSize) {
      body.pageSize = this.contactsPageSize;
    }

    if (this.standIn && this.setStandInHeaders) {
      const contactsRequestHeaders = {
        authenticationtype: this.authenticationType,
        authenticationData: `deviceId=${this.deviceId}`
      };

      this._dispatchCustomEvent('contacts-list-request-headers', contactsRequestHeaders);
    }

    this._dispatchCustomEvent('get-contacts-list', this.extendContacts ? body : params);
  }

  /**
   * Dispatch modal config when a product is deleted
   * Receives product data from UI
   * @param {Object} product
   */
  deleteProductModalConfig(product) {
    let contactId = this.c(product, 'operationData.contactId');
    let productId = this.c(product, 'productId');
    let eventName = 'open-confirm-delete-modal';
    let detail = {
      code: 'DELETE-CONTACT-AGENDA',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-contacts-agenda-list-delete-accept-button-modal',
        onAcceptEvent: () => this.deleteProduct(contactId, productId),
        cancelBtLabel: 'cells-contacts-agenda-list-delete-cancel-button-modal',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert', class: 'spacing' },
            { title: this.t('cells-contacts-agenda-list-delete-product-title-modal', '¿Quieres eliminar este producto?') },
            { text: this.t('cells-contacts-agenda-list-delete-product-text-modal', 'Considera que se borrarán los datos del producto de este contacto') }
          ]
        }
      }
    };


    this.dispatchEvent(new CustomEvent(eventName, {
      detail: detail,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Dispatch modal config when a number is deleted
   * Receives contact data from UI
   * @param {Object} contact
   */
  deleteNumberModalConfig(contact) {
    const contactDetail = {
      'contactId': this.get('operationData.id', contact),
      'contactInformationId': this.get('operationData.contactInformationId', contact)
    };
    const detail = {
      code: 'DELETE-NUMBER-CONTACT-AGENDA',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-contacts-agenda-list-delete-accept-button-modal',
        cancelBtLabel: 'cells-contacts-agenda-list-delete-cancel-button-modal',
        onAcceptDetail: contactDetail,
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert', class: 'spacing' },
            { title: this.t('cells-contacts-agenda-list-delete-number-title-modal', '¿Quieres eliminar este número?') },
            { text: this.t('cells-contacts-agenda-list-delete-number-text-modal', 'Considera que se borrarán los datos del número de este contacto') }
          ]
        }
      }
    };
    this._dispatchCustomEvent('open-confirm-delete-modal', detail);
  }

  /**
   * Delete product function sends product to api to delete a product
   * @param {String} contact
   * @param {String} product
   */
  deleteProduct(contact = '', product = '') {
    this.isProduct = true;
    const contactProducts = this.contactsResponse.find(element => element?.contactId === contact);
    if (contactProducts?.products) {
      if (contactProducts.products.length <= 1) {
        this.deleteContact(contact);
      } else {
        this.dispatchEvent(new CustomEvent('delete-product', {
          bubbles: true,
          composed: true,
          detail: {
            'contact': contact,
            'product': product
          }
        }));
      }
    }
  }

  /**
   * Setting the project name depending if the app is in standin mode
   * @event contacts-agenda-setting-project-name
   */
  setProjectNameStandin() {
    this._dispatchCustomEvent('contacts-agenda-setting-project-name', {
      pagePageInfoProjectName: this.standIn ? this.get('projectNameGlomoAlwaysOn') : this.get('projectNameGlomo')
    });
  }

  /**
   * Successful response on delete contact or product from list
   */
  deleteContactProductSuccessfully() {
    this.openVeil();
    this.reset();
    this.toastMessage = this.isProduct ? 'cells-contacts-agenda-product-successfully-deleted' : 'cells-contacts-agenda-contact-successfully-deleted';
    this.getContacts();
    this._dispatchCustomEvent('success-message-snackbar', this.toastMessage);
    this.isProduct = false;
  }

  /**
   * Error API response on delete contact or product from list
   */
  deleteContactProductError() {
    this.openVeil();
    this.reset();
    this.toastMessage = this.isProduct ? 'cells-contacts-agenda-product-unsuccessfully-deleted' : 'cells-contacts-agenda-contact-unsuccessfully-deleted';
    this._dispatchCustomEvent('get-contacts-list', this.extendContacts ? { 'expand': 'products' } : null);
    this._dispatchCustomEvent('error-message-snackbar', this.toastMessage);
    this.isProduct = false;
  }

  /**
   * Successful response on delete contact or number from list
   */
  deleteContactNumberSuccessfully() {
    this.openVeil();
    this.reset();
    this._dispatchCustomEvent('get-contacts-list', { expand: 'contacts-information', pageSize: 999 });
    this._launchToast({
      message: this.toastMessage
    });
  }

  /**
   * Search for a contact or product based on a string
   *  @param {String} str
   */
  filterContacts(str) {
    if (this.isSpherica) {
      str = (str || {}).value;
    }
    this._resetNotFoundInfo();
    let contacts = [ ... this._rawContacts ];
    if (str) {
      let regExp = new RegExp(str.trim(), 'i');
      contacts = contacts.filter(i => regExp.test(JSON.stringify(i)));
      if (!contacts.length) {
        const info = {
          [this.isSpherica ? 'title' : 'message']: isNaN(str) ? 'cells-contacts-agenda-no-name-found-message' : 'cells-contacts-agenda-no-number-found-message',
          image: this.noContactsImg
        };
        this._dispatchCustomEvent('no-contacts-found', info);
      }
      const letterGroupedContacts = contacts.reduce(this._contactsReducer.bind(this), {});
      this.parsedContacts = this._getGroupedContactsArray(letterGroupedContacts);
      this._dispatchCustomEvent('filtered-contacts-list', this.parsedContacts, true, true);
    } else {
      this.parseContacts();
    }
  }

  /**
   * Receives and parses a product data from UI
   *  @param {Object} product
   */
  onSelectedProduct(product) {
    if (product !== null && Object.prototype.hasOwnProperty.call(product, 'productId')) {
      let productSelected = {
        displayNumber: this.get('number', product).trim(),
        completeNumber: this.get('completeNumber', product).trim(),
        bank: {
          id: this.get('bank.id', product),
          name: this.get('bank.name', product).trim()
        },
        accountCurrencyType: {
          title: 'refactor-transfer-banking-entity',
          name: this.get('bank.name', product).trim()
        },
        alias: this.get('itemTitle', product),
        disableInputSecondary: false,
        name: this.get('itemSubtitle', product).trim(),
        products: [
          {
            number: this.get('number', product),
            numberType: this.get('numberType', product),
            productType: this.get('productType', product),
            bank: {
              id: this.get('bank.id', product),
              name: this.get('bank.name', product).trim(),
            },
            specificProductType: (Object.prototype.hasOwnProperty.call(product, 'specificProductType')) ? this.get('specificProductType', product) : this.get('productType', product)
          }
        ],
        person: {
          firstName: this.get('itemSubtitle', product).trim()
        }
      };
      this._dispatchCustomEvent('item-selected', {
        page: 'transfers',
        params: {
          detail: productSelected,
          fromPage: 'transfers',
        }
      });
    }
  }
}

customElements.define(GlomoContactsAgendaDmMx.is, GlomoContactsAgendaDmMx);
