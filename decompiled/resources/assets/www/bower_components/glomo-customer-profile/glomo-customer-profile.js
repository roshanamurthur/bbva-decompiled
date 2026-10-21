/**
 *
 * # &lt;glomo-customer-profile&gt;
 *
 * ![Certificated](https://img.shields.io/badge/certificated-yes-brightgreen.svg) ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
 *
 * [Demo of component in Cells Catalog](https://catalogs.platform.bbva.com/cells)
 *
 * Component that shows info about a user
 *
 * Example:
 * ```html
 * <glomo-customer-profile></glomo-customer-profile>
 * ```
 *
 * ## Icons
 *
 * Since this component uses icons, it will need an [iconset](https://bbva.cellsjs.com/guides/best-practices/cells-icons.html) in your project as an [application level dependency](https://bbva.cellsjs.com/guides/advanced-guides/application-level-dependencies.html). In fact, this component uses an iconset in its demo.
 *
 * ## Styling
 *
 * The following custom properties and mixins are available for styling:
 *
 * ### Custom Properties
 * | Custom Property       | Selector                                              | CSS Property                            | Value                                                            |
 * | --------------------- | ----------------------------------------------------- | --------------------------------------- | ---------------------------------------------------------------- |
 * | --cells-fontDefault   | :host                                                 | font-family                             | sans-serif                                                       |
 * | --bbva-core-blue      | :host .customer-avatar .portrait cells-contact-avatar | --cells-contact-avatar-initial-bg       | ![#004481](https://placehold.it/15/004481/000000?text=+) #004481 |
 * | --bbva-dark-core-blue | :host .customer-avatar .portrait cells-contact-avatar | --cells-contact-avatar-initial-color-bg | ![#043263](https://placehold.it/15/043263/000000?text=+) #043263 |
 * | --bbva-medium-blue    | :host .customer-info__item .info-button               | color                                   | ![#237ABA](https://placehold.it/15/237ABA/000000?text=+) #237ABA |
 * | --bbva-medium-blue    | :host .customer-info__item .after-key                 | color                                   | ![#237ABA](https://placehold.it/15/237ABA/000000?text=+) #237ABA |
 * ### @apply
 * | Mixins                                                     | Selector                                                  | Value |
 * | ---------------------------------------------------------- | --------------------------------------------------------- | ----- |
 * | --glomo-customer-profile                                   | :host                                                     | {}    |
 * | --glomo-customer-profile-full-width-items                  | :host(.full-width-items)                                  | {}    |
 * | --glomo-customer-profile-customer-avatar                   | :host .customer-avatar                                    | {}    |
 * | --glomo-customer-profile-customer-avatar-button            | :host .customer-avatar .edit-button                       | {}    |
 * | --glomo-customer-profile-customer-avatar-portrait          | :host .customer-avatar .portrait                          | {}    |
 * | --glomo-customer-profile-customer-avatar-portrait-gradient | :host .customer-avatar .portrait::after                   | {}    |
 * | --glomo-customer-profile-customer-avatar-portrait-image    | :host .customer-avatar .portrait__image                   | {}    |
 * | --glomo-customer-profile-customer-avatar-portrait-initials | :host .customer-avatar .portrait__initials                | {}    |
 * | --glomo-customer-profile-customer-avatar-portrait-avatar   | :host .customer-avatar .portrait cells-contact-avatar     | {}    |
 * | --glomo-customer-profile-customer-name                     | :host .customer-name                                      | {}    |
 * | --cells-fontDefaultMedium                                  | :host .customer-name .first-name                          | {}    |
 * | --glomo-customer-profile-customer-first-name               | :host .customer-name .first-name                          | {}    |
 * | --glomo-customer-profile-customer-last-name                | :host .customer-name .last-name                           | {}    |
 * | --glomo-customer-profile-customer-info                     | :host .customer-info                                      | {}    |
 * | --glomo-customer-profile-customer-info-img                 | :host .customer-info img                                  | {}    |
 * | --glomo-customer-profile-customer-info-group               | :host .customer-info__group                               | {}    |
 * | --glomo-customer-profile-customer-info-item                | :host .customer-info__item                                | {}    |
 * | --glomo-customer-profile-customer-info-item-button         | :host .customer-info__item .info-button                   | {}    |
 * | --cells-fontDefaultMedium                                  | :host .customer-info__item .after-key                     | {}    |
 * | --glomo-customer-profile-customer-info-item-after-key      | :host .customer-info__item .after-key                     | {}    |
 * | --glomo-customer-profile-date                              | cells-atom-date                                           | {}    |
 * | --glomo-customer-profile-key-values-value                  | cells-key-values > --cells-key-values-value:              | {}    |
 * | --glomo-customer-profile-key-values-value-mask             | cells-key-values > --cells-key-values-value-mask:         | {}    |
 * | --glomo-customer-profile-key-values                        | cells-key-values                                          | {}    |
 * | --glomo-customer-profile-italic-key-values-value           | cells-key-values.italic-value > --cells-key-values-value: | {}    |
 * | --glomo-customer-profile-italic-key-values                 | cells-key-values.italic-value                             | {}    |
 * | --glomo-customer-profile-masked-key-values-value           | cells-key-values.masked > --cells-key-values-value:       | {}    |
 * | --glomo-customer-profile-masked-key-values                 | cells-key-values.masked                                   | {}    |
 * | --glomo-customer-profile-customer-section                  | :host .customer-section                                   | {}    |
 * | --glomo-customer-profile-key-values                        | :host .customer-section cells-key-values                  | {}    |
 * | --glomo-customer-profile-key-values-icon                   | :host .customer-section cells-key-values cells-atom-icon  | {}    |
 * | --glomo-customer-profile-after-key                         | :host .customer-section .after-key                        | {}    |
 * | --glomo-customer-profile-group                             | :host .customer-section__group                            | {}    |
 * | --glomo-customer-profile-last-section                      | :host .customer-section:last-of-type                      | {}    |
 * | --glomo-customer-profile-product-more-info                 | :host .customer-section .data-protection-status           | {}    |
 * | --glomo-customer-profile-heading                           | :host cells-heading                                       | {}    |
 * | --glomo-customer-profile-first-heading                     | :host cells-heading[level="1"]                            | {}    |
 * | --glomo-customer-profile-second-heading                    | :host cells-heading[level="2"]                            | {}    |
 * | --glomo-customer-profile-icon-message                      | :host cells-icon-message                                  | {}    |
 * | --glomo-customer-profile-icon-message-error-image          | :host cells-icon-message .error-image                     | {}    |
 * | --glomo-customer-profile-show-data                         | :host .show-data                                          | {}    |
 * | --glomo-customer-profile-button                            | :host cells-st-button                                     | {}    |
 * | --glomo-customer-profile-button-add                        | :host cells-st-button .add                                | {}    |
 * | --glomo-customer-profile-product-selector                  | :host cells-product-selector                              | {}    |
 * | --glomo-customer-profile-selector-product-item-additional-information                | :host cells-product-selector .additional-information   | {}     |
 * | --glomo-customer-profile-selector-product-item-additional-information-normal-font                | :host cells-product-selector .additional-information .normal-font-style    | {}     |
 * | --glomo-customer-profile-phones-section                    | :host .phones-section                                     | {}    |
 * | --glomo-customer-profile-emails-section                    | :host .emails-section                                     | {}    |
 * | --glomo-customer-profile-addresses-section                 | :host .addresses-section                                  | {}    |
 * | --glomo-customer-profile-contracts-section                 | :host .contracts-section                                  | {}    |
 * | --glomo-customer-profile-contracts-section-link            | :host .contracts-section cells-st-button                  | {}    |
 * | --glomo-customer-profile-section-product-selector-not-last | .phones-section li:not(:last-of-type), .emails-section li:not(:last-of-type), .addresses-section li:not(:last-of-type) | {}    |
 * | --glomo-customer-profile-section-product-selector-last     | .phones-section li:last-of-type, .emails-section li:last-of-type, .addresses-section li:last-of-type | {}    |
 * | --glomo-customer-profile-key-container                     | .customer-section .key-container                          | {}    |
 * | --glomo-customer-profile-main-mail-icon                    | .customer-section .key-container .info-main-mail          | {}    |
 * | --glomo-customer-profile-icon-wrapper                      | :host                                                     | {}    |
 * @summary Component that shows info about a user
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 * @demo demo/index.html
 * @hero glomo-customer-profile.png
 */
class GlomoCustomerProfile extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior
], Polymer.Element) {
  /* global moment */
  static get is() {
    return 'glomo-customer-profile';
  }
  static get properties() {
    return {
      /**
       * Customer object
       * @type {Object}
       */
      customer: {
        type: Object,
        observer: '_customerChanged',
        notify: true,
        value: () => { }
      },

      /**
       * Customer section title
       */
      customerSectionTitle: {
        type: String,
        value: 'glomo-customer-profile-profile'
      },
      /**
       * Mobile img source
       * @type {String}
       */
      mobileImgSource: {
        type: String,
        value: ''
      },
      /**
       * Email img source
       * @type {String}
       */
      emailImgSource: {
        type: String,
        value: ''
      },
      /**
       * Configuration of modal
       * @type {Object}
       */
      configModal: {
        type: Object,
        notify: true
      },
      /**
       * Customer contact details array
       * @type {Array}
       */
      customerContactDetails: {
        type: Array,
        value: () => []
      },
      /**
       * Customer address object
       * @type {Object}
       */
      customerAddress: {
        type: Object,
        value: () => ({})
      },
      /**
       * customer kyc questionnaire state
       */
      customerKycQuestionnaire: {
        type: Object,
        value: () => ({})
      },
      /**
       * File formats accepted to upload
       */
      fileFormatsAccepted: {
        type: String,
        value: '.jpg,.jpeg,.png,.gif,.bmp,.tiff'
      },
      /**
       * Avatar
       */
      avatar: Object,
      /**
       * Avatar image src
       */
      avatarSrc: {
        type: String,
        computed: '_avatarSrcComputed(avatar)',
        notify: true
      },
      /**
       * First icon for cells-product-selector
       */
      contactPrimaryIcon: {
        type: String,
        value: 'coronita:edit'
      },
      /**
       * Button created from contactPrimaryIcon and changes status according to unmaskData
       */
      _contactPrimaryButton: {
        type: Object,
        computed: '_setPrimaryButton(contactPrimaryIcon, unmaskData, hidePrimaryIconButtons)'
      },
      /**
      * Second icon for cells-product-selector
      */
      contactSecondaryIcon: {
        type: String,
        value: 'coronita:trash'
      },
      /**
       * Button created from contactSecondaryIcon and changes status according to unmaskData
       */
      _contactSecondaryButton: {
        type: Object,
        computed: '_setSecondaryButton(contactSecondaryIcon, hideSecondaryIconButtons)'
      },
      /**
       * Profile fields can't change
       */
      immutableProfile: {
        type: Boolean,
        value: false
      },
      /**
       * Array of user contacts details
       */
      userContactDetail: {
        type: Array
      },
      /**
       * Array of user addresses details
       */
      userAddressDetail: {
        type: Array
      },
      /**
       * Principal user phone contact
       */
      mainPhone: {
        type: Object,
        value: null
      },
      /**
       * Principal user email contact
       */
      mainEmail: {
        type: Object,
        value: null
      },
      /**
       * Principal user email address
       */
      mainAddress: {
        type: Object
      },
      /**
       * User addresses
       */
      addresses: {
        type: Object,
        value: () => ({})
      },
      /**
       * Maximum number of contacts details in lists
       */
      maxVisibleContactDetails: {
        type: Number,
        value: 5
      },
      /**
       * To control full profile version (with user contacts lists)
       */
      fullProfile: {
        type: Boolean,
        value: false
      },
      /**
       * Boolean to know if data is unmasked
       */
      unmaskData: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to display customer address
       */
      _unMaskAddressInformation: {
        type: Boolean,
        value: false,
      },
      /**
       * Flag to display error customer address
       */
      showAddressError: {
        type: Boolean,
        value: false,
      },
      /**
       * Boolean to know if main email can be edited
       */
      enableEditEmail: {
        type: Boolean,
        value: false
      },
      /**
       * Boolean to know if show help icons
       */
      showHelpIcons: {
        type: Boolean,
        value: false
      },
      /**
       * Array with data protection regulation status info
       */
      dataProtectionRegulationStatus: {
        type: Array
      },
      /**
       * Phone sections
       */
      _phoneSections: {
        type: Array,
        computed: '_parsePhoneSections(userContactDetail.phone)'
      },
      /**
       * Email sections
       */
      _emailSections: {
        type: Array,
        computed: '_parseEmailSections(userContactDetail.email)'
      },
      /**
       * Address sections
       */
      _addressSections: {
        type: Array,
        computed: '_parseAddressSections(userAddressDetail.address)'
      },
      /**
       * Last access date
       */
      _lastAccessDate: {
        type: String,
        computed: '_computeLastAccessDate(customer.lastAccessDate)'
      },
      /**
       * Last access date format
       */
      lastAccessDateFormat: {
        type: String,
        value: 'DD/MM/YYYY hh:mm:ss a'
      },
      /**
       * Show last access date?
       */
      showLastAccessDate: {
        type: Boolean,
        value: false
      },
      /**
       * Hide password?
       */
      hidePassword: {
        type: Boolean,
        value: false
      },
      /**
       * Hide main phone?
       */
      hideMainPhone: {
        type: Boolean,
        value: false
      },
      /**
       * Hide main email?
       */
      hideMainEmail: {
        type: Boolean,
        value: false
      },
      /**
       * Phone section title
       */
      _phoneSectionTitle: {
        type: String,
        computed: '_computePhoneSectionTitle(hideMainPhone, _phoneSections)'
      },
      /**
       * Email section title
       */
      _emailSectionTitle: {
        type: String,
        computed: '_computeEmailSectionTitle(hideMainEmail, _emailSections)'
      },
      /**
       * Address section title
       */
      _addressSectionTitle: {
        type: String,
        computed: '_computeAddressSectionTitle(hideMainAddress, _addressSections)'
      },
      /**
       * Contracts section title
       */
      _contractsSectionTitle: {
        type: String,
        value: 'glomo-customer-profile-contracts'
      },
      /**
       * Contracts section view link text
       */
      _contractsSectionViewLink: {
        type: String,
        value: 'glomo-customer-profile-contracts-view'
      },
      /**
       * Is phone section visible?
       */
      _visiblePhoneSection: {
        type: Boolean,
        value: false,
        computed: '_computeVisiblePhoneSection(userContactDetail.phone, hidePhoneSection)'
      },
      /**
       * Is email section visible?
       */
      _visibleEmailSection: {
        type: Boolean,
        value: false,
        computed: '_computeVisibleEmailSection(userContactDetail.email, hideEmailSection)'
      },
      /**
       * Is address section visible?
       */
      _visibleAddressSection: {
        type: Boolean,
        computed: '_computeVisibleAddressSection(userAddressDetail.address)'
      },
      /**
       * Disable add new phone?
       */
      disableAddNewPhone: {
        type: Boolean,
        value: false
      },
      /**
       * Disable add new email?
       */
      disableAddNewEmail: {
        type: Boolean,
        value: false
      },
      /**
       * Disable add new address?
       */
      disableAddNewAddress: {
        type: Boolean,
        value: false
      },
      /**
       * Is add address button visible?
       */
      _visibleAddNewAddress: {
        type: Boolean,
        value: false,
        computed: '_computeVisibleAddNewAddress(disableAddNewAddress, _hasReachedMaximumAddresses)'
      },
      /**
       * Hide customer section when customer is null?
       */
      hideCustomerSectionWhenCustomerIsNull: {
        type: Boolean,
        value: false
      },
      /**
       * Is customer secion hidden?
       */
      _hideCustomerSection: {
        type: Boolean,
        computed: '_computeHideCustomerSection(customer, hideCustomerSectionWhenCustomerIsNull)'
      },
      /**
       * Is customer tax residence secion hidden?
       */
      _showCustomerTaxResidence: {
        type: Boolean,
        computed: '_computeShowTaxResidenceSection(customer)'
      },
      /**
       * show/hide not full profile address item
       */
      showNotFullProfileAddress: {
        type: Boolean,
        value: false
      },
      /**
       * show customer address secion ?
       */
      _showCustomerAddress: {
        type: Boolean,
        computed: '_computeShowAddressSection(customerAddress, fullProfile, showNotFullProfileAddress)'
      },
      /**
       * Hide customer avatar section?
       */
      hideCustomerAvatarSection: {
        type: Boolean,
        value: false
      },
      /**
       * Hide show data section?
       */
      hideShowDataSection: {
        type: Boolean,
        value: false
      },
      /**
       * Hide show data section on not fullProfile mode?
       */
      showTopInfoMessageNotFullProfile: {
        type: Boolean,
        value: false
      },
      /**
       * Settings for top info message on not fullProfile mode
       */
      topInfoMessageNotFullProfileSettings: {
        type: Object,
        value: () => ({})
      },
      /**
       * Hide primary icon buttons in list items?
       */
      hidePrimaryIconButtons: {
        type: Boolean,
        value: false
      },
      /**
       * Hide secondary icon buttons in list items?
       */
      hideSecondaryIconButtons: {
        type: Boolean,
        value: false
      },
      /**
       * Additional actions for the list items
       */
      detailItemActions: {
        type: Array,
        value: () => []
      },
      /**
       * Hide list item icons?
       */
      hideItemIcons: {
        type: Boolean,
        value: false
      },
      /**
       * Show contracts section?
       */
      showContractsSection: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Show Update Rfc section?
       */
      showUpdateRfcSection: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * View all width index
       */
      viewAllWidthIndex: {
        type: Boolean,
        value: false
      },
      /**
       * View all literal
       */
      _viewAllLabel: {
        type: String,
        value: 'glomo-customer-profile-view-all'
      },
      /**
       * Masked password value
       */
      maskedPasswordValue: {
        type: String,
        value: '••••••'
      },
      /**
       * Flag to indicate if email validation is enabled
       */
      enableEmailValidation: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to indicate if password is enabled
       */
      enablePassword: {
        type: Boolean,
        value: false
      },
      /**
      * return true if change password is enabled
      */
      _isChangePasswordEnabled: {
        type: Boolean,
        computed: '_enableChangePassword(fullProfile, enablePassword)'
      },
      /**
       * Flag to display error image message instead of image or initials
       */
      showErrorImage: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to display tax residence information details
       */
      _taxResidenceIsUnmasked: {
        type: Boolean,
        value: false,
      },

      _computedShowHideTaxResidenceLabel: {
        type: String,
        computed: '_computeSectionShowHideLabel(_taxResidenceIsUnmasked)'
      },

      _computeTaxResidenceWarnignLabel: {
        type: String,
        computed: '_computeSectionWarningLabel(_taxResidenceIsUnmasked)'
      },

      /**
       * Aria-level to screen reader title header
       */
      titleLevel: {
        type: String,
        value: '2'
      },
      /**
       * Aria-level to screen reader subtitle header
       */
      subTitleLevel: {
        type: String,
        value: '3'
      },
      /**
        * Help atom icon role in order to screen reader read the element correctly
        */
      roleIcon: {
        type: String,
        value: 'button'
      },
      /**
       * personal information section flag to switch error/data
       */
      showPersonalInformationError: {
        type: Boolean,
        value: false
      },
      /**
       * contact section mobile section flag to switch error/data
       */
      showContactsSectionError: {
        type: Boolean,
        value: false
      },
      /**
       * know your client section flag to switch error/data
       */
      showKnowYourClientError: {
        type: Boolean,
        value: false
      },
      /**
       * generic error message label - max retries
       * @default 'glomo-customer-profile-retry-max-error-message'
       */
      maxRetriesReachedErrorMessage: {
        type: String,
        value: 'glomo-customer-profile-retry-max-error-message'
      },
      /**
       * generic error message label - max retries
       * @default 'glomo-customer-profile-retry-max-call-label'
       */
      maxRetriesReachedActionLabel: {
        type: String,
        value: 'glomo-customer-profile-retry-max-call-label"'
      },
      /**
       * personal information error meesage label
       * @default 'glomo-customer-profile-retry-error-message'
       */
      personalInformationErrorMessage: {
        type: String,
        value: 'glomo-customer-profile-retry-error-message'
      },
      /**
       * contact section mobile error meesage label
       * @default 'glomo-customer-profile-retry-error-message'
       */
      contactsSectionErrorMessage: {
        type: String,
        value: 'glomo-customer-profile-retry-error-message'
      },
      /**
       * address section error meesage label
       * @default 'glomo-customer-profile-retry-error-message'
       */
      addressErrorMessage: {
        type: String,
        value: 'glomo-customer-profile-retry-error-message'
      },
      /**
       * know your client error message label
       */
      knowYourClientErrorMessage: {
        type: String,
        value: 'glomo-customer-profile-retry-error-message'
      },
      /**
       * Hide personal information retry btn flag
       * @default false
       */
      hidePersonalInformationRetryBtn: {
        type: Boolean,
        value: false
      },
      /**
       * Hide contact section mobile retry btn flag
       * @default false
       */
      hideContactsSectionRetryBtn: {
        type: Boolean,
        value: false
      },
      /**
       * Hide address section retry btn flag
       */
      hideAddressRetryBtn: {
        type: Boolean,
        value: false
      },
      /**
       * Hide contact know your client retry btn flag
       */
      hideKnowYourClientRetryBtn: {
        type: Boolean,
        value: false
      },
      /*
       * Extra wrapper help icon class
       */
      extraHelpIconClass: {
        type: String,
        value: ''
      },
      /**
       * Hide no-mobile help icon when showHelpIcons is true
       */
      hideNoMobileHelpIcon: {
        type: Boolean,
        value: false
      },
      /**
       * compute if no-mobile help icon vs showHelpIcons
       */
      _computedShowNoMobileHelpIcon: {
        type: Boolean,
        computed: '_computeShowNoMobileHelpIcon(showHelpIcons, hideNoMobileHelpIcon)'
      },

      /**
       * Enable show/hide personal information button
       * @default false
       */
      enableShowHidePersonalInformation: {
        type: Boolean,
        value: false
      },

      /**
       * show/hide birth date section
       */
      showBirthDate: {
        type: Boolean,
        value: false
      },

      _contactsUnmasked: {
        type: Boolean,
        computed: '_computeContactsUnmasked(customerContactDetails)'
      },

      _computedShowHideContactsLabel: {
        type: String,
        computed: '_computeSectionShowHideLabel(_contactsUnmasked)'
      },
      /**
       * Flag to display email warning label
      */
      _computeEmailWarnignLabel: {
        type: String,
        computed: '_computeSectionWarningLabel(_contactsUnmasked)'
      },

      addressIsUnmasked: {
        type: Boolean,
        value: false
      },

      /**
       * Show/hide button label toggles between show/hide locales to address
       */
      _computedShowHideAddressLabel: {
        type: String,
        computed: '_computeSectionShowHideLabel(addressIsUnmasked)'
      },

      _computedAddressWarningLabel: {
        type: String,
        computed: '_computeSectionWarningLabel(addressIsUnmasked)'
      },

      /**
       * additional customer documents masked flag
       */
      additionalDocumentsUnmasked: {
        type: Boolean,
        value: false
      },

      /**
       * computed if birthdata must be masked depending on additionalDocumentsUnmasked prop
       */
      computedBirthDataMasked: {
        type: String,
        computed: '_computeBirthDateMasked(additionalDocumentsUnmasked)'
      },

      /**
       * compute additional documents label depending on additionalDocumentsUnmasked prop
       */
      _computedAdditionalDocumetsWarningLabel: {
        type: String,
        computed: '_computeSectionWarningLabel(additionalDocumentsUnmasked)'
      },

      /**
       * show/hide personal information label button
       */
      _showHidePersonalInfoDocuments: {
        type: String,
        value: 'glomo-customer-profile-unmask'
      },

      /**
       * key container extra class
       */
      extraKeyContainerClass: String,

      /**
       * reduce key container class name, usefull to change padding
       * for margin with 'reduce-key-container' class
       */
      reduceKeyContainerClass: String,

      /**
       * flag to show the edit button
       */
      showEditAvatarButton: {
        type: Boolean,
        value: false
      },

      /**
       * validate what button to edit avatar is necessary showed: input button or button
       */
      _showEditAvatarButton: {
        type: Boolean,
        computed: '_computeShowEditAvatarButton(fullProfile, showEditAvatarButton)'
      },

      /**
       * show contracts section on not full profile
       */
      _showContractsSection: {
        type: Boolean,
        computed: '_computeShowContractsSection(showContractsSection, fullProfile)'
      },
      /**
       * show update rfc section on not full profile
       */
      _showUpdateRfcSection: {
        type: Boolean,
        computed: '_computeShowUpdateRfcSection(showUpdateRfcSection, fullProfile)'
      },

      /**
       * show contracts section info icon
       */
      showContractsInfoIcon: {
        type: Boolean,
        value: false
      },
      /**
       * global cache storage
       */
      globalCacheStorage: Object,

      /**
       * has to be hide residence tax section
       */
      hideResidenceTaxSection: {
        type: Boolean,
        value: false
      },
      /**
       * Is unsubscribe section visible?
       */
      visibleUnsubscribeSection: {
        type: Boolean,
        value: false
      },
      /**
       * show unsubscribe section or not
       */
      _showUnsubscribeSection: {
        type: Boolean,
        computed: '_computeShowUnsubscribeSection(visibleUnsubscribeSection, customer)'
      },
      /**
       * show the item without waiting for the customer to come
       */
      notWaitForCustomer: {
        type: Boolean,
        value: false
      },

      /**
       * flag to show/hide birth data section
       */
      showBirthData: {
        type: Boolean,
        value: false
      },
      /**
       * css alternative class for non validated email
       */
      nonValidatedEmailClass: {
        type: String,
        value: 'customer-non-validated-item'
      },
      /**
       * Custom CSS class for customer-section section
       */
      customerSectionCustomClass: {
        type: String
      },
      /**
       * Hide headings if not necessary.
       */
      hideTitleHeadings: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Render subpage menu only
       */
      displaySubPageMenu: {
        type: Boolean,
        notify: true,
        value: false
      },
      /**
       * Hide main address.
       */
      hideMainAddress: {
        type: Boolean,
        value: false
      },
      /**
       * Defines an array that configures the buttons that will be rendered as the sub page menu.
       */
      subPageMenuConfig: {
        type: Array,
        value: () => [
          {
            icon: 'coronita:telephone',
            titleText: 'glomo-customer-profile-phones',
            id: 'phones'
          },
          {
            icon: 'coronita:email',
            titleText: 'glomo-customer-profile-emails',
            id: 'emails'
          },
          {
            icon: 'coronita:agenda',
            titleText: 'glomo-customer-profile-addresses',
            id: 'addresses'
          },
          {
            icon: 'coronita:document',
            titleText: 'glomo-customer-profile-contracts',
            id: 'contracts'
          },
          {
            icon: 'coronita:noclient',
            titleText: 'glomo-customer-profile-unsubscribe',
            id: 'unsubscribe'
          }
        ]
      },
      /**
       * Hides the phone section
       */
      hidePhoneSection: {
        type: Boolean,
        value: false,
      },
      /**
       * Hides the email section
       */
      hideEmailSection: {
        type: Boolean,
        value: false,
      },
      /**
       * Renders the action links on the cells product selector in a inferior container
       * to the product, opposed to the default lateral rendering.
       */
      displayAddressActionsAsLinks: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Renders the action links on the cells product selector in a inferior container
       * to the product, opposed to the default lateral rendering.
       */
      displayEmailActionsAsLinks: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Renders the action links on the cells product selector in a inferior container
       * to the product, opposed to the default lateral rendering.
       */
      displayPhoneActionsAsLinks: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Flag for rendering the warning on maximum amount of addresses
       */
      _hasReachedMaximumAddresses: {
        type: Boolean,
        value: false,
      },
      /**
       * Label for the warning on maximum amount of addresses
       */
      reachedMaxAddressesInfoMessage: {
        type: String,
        value: 'glomo-customer-profile-address-max-addresses'
      },
      /**
       * Flag for enabling basic error on casic customer info get.
       */
      displayPersonalInformationErrorMaxRetries: {
        type: Boolean,
        value: false
      },
      /**
       * Customer fiscal data object
       */
      customerFiscalData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Hide fiscal data section
       */
      hideFiscalDataSection: {
        type: Boolean,
        value: false
      },
      /**
       * Check if customer fiscal data section is hidden
       */
      _showCustomerFiscalData: {
        type: Boolean,
        computed: '_computeShowFiscalDataSection(customerFiscalData, hideFiscalDataSection)'
      },
      /**
       * Check what type of event should emit
       */
      _computedShowHideFiscalDataLabel: {
        type: String,
        computed: '_computeShowHideFiscalDataLabel(customerFiscalData)'
      },
      /**
       * Show addresses section
      */
      _showAddressesSection: {
        type: Boolean,
        computed: '_computeVisibleAddressesSection(addresses)'
      },
      /**
       * Show principal addresses section
      */
      _showPrincipalAddress: {
        type: Boolean,
        value: false,
        computed: 'computeHidePrincipalAddress(addresses)'
      },
      /**
       * Show secondary addresses section
      */
      _showSecondaryAddress: {
        type: Boolean,
        value: false,
        computed: 'computeHideSecondaryAddress(addresses)'
      },
      /**
       * Enable edit buttons
      */
      _isEditAddress: {
        type: Boolean,
        value: false,
        computed: '_computeEditAddress(unmaskData)'
      },
      /**
       * Add edit class
      */
      _editClass: {
        type: String,
        computed: '_computeAddressEditClass(unmaskData)'
      },
      /**
       * Show data info
      */
      _showUnmaskDataInfo: {
        type: Boolean,
        value: false,
        computed: '_computeUnmaskDataInfo(unmaskData)'
      },
      /**
       * Hide data info switch
       */
      hideUnmaskDataInfo: {
        type: Boolean,
        value: false
      },
      /**
       * Handle the functionality for retry button in notification error.
       * @type {Boolean}
       */
      hideRecipientsSectionRetryBtn: {
        type: Boolean,
        value: false
      },
      /**
       * Error message for recipients section.
       * @type {String}
       */
      recipientsErrorMessage: {
        type: String,
        value: 'glomo-customer-profile-retry-error-message'
      },
      /**
      * recipients section flag to switch error/data
      */
      showRecipientSectionError: {
        type: Boolean,
        value: false
      },
      /**
       * Internal flag that controls rendring of error on basic customer info.
       */
      _displayPersonalInformationErrorMaxRetries: {
        type: Boolean,
        value: false,
        computed: '_computeDisplayPersonalInformationErrorMaxRetries(displayPersonalInformationErrorMaxRetries)'
      },
      /**
       * Flag to know if the user has recipients.
       * @type {Boolean}
       */
      hasRecipients: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to display aditional accounts for recipients section.
       * @type {Boolean}
       */
      _showAditionalAccounts: {
        type: Boolean,
        value: false

      },
      /**
       * Set data accounts for recipients section.
       * @type {Object}
       */
      dataAccounts: {
        type: Object,
        value: () => ({})
      },
      /**
       * Set button hidden
       * @type {Boolean}
      */
      hiddenButton: {
        type: Boolean,
        value: false
      },
      /**
       * Defines an object that configures the properties of its attributes
       * @type {Object}
      */
      showEmptyFiscalInfo: {
        type: Object,
        value: () => (
          {
            icon: 'coronita:info',
            type: 'warning-dark',
            heading: 'glomo-customer-profile-fiscal-data-section-heading-empty',
            message: 'glomo-customer-profile-fiscal-data-section-description-empty',
          }
        )
      },
      /**
       * Defines an object that configures the properties of its attributes
       * @type {Object}
      */
      showGenericFiscalInfo: {
        type: Object,
        value: () => (
          {
            icon: 'coronita:info',
            type: 'warning-dark',
            heading: 'glomo-customer-profile-fiscal-data-section-heading-generic-rfc',
            message: 'glomo-customer-profile-fiscal-data-section-description-generic-rfc-one',
            subMessage: 'glomo-customer-profile-fiscal-data-section-description-generic-rfc-two',
          }
        )
      },
      /**
       * Defines an object that configures the properties of its attributes
       * @type {Object}
      */
      showEntryPointFiscalInfo: {
        type: Object,
        value: () => (
          {
            icon: 'coronita:info',
            type: 'info',
            heading: 'glomo-customer-profile-fiscal-data-section-heading-update-rfc',
            message: 'glomo-customer-profile-fiscal-data-section-description-update-rfc',
            subBtnMessage: 'glomo-customer-profile-fiscal-data-section-button-update-rfc',
          }
        )
      },
      /**
       * Define a message in update rfc empty
       * @type {String}
       */
      labelShowEmptyFiscalInfo: {
        type: String,
        value: 'glomo-customer-profile-fiscal-data-section-message-empty'
      }
    };
  }
  /**
   * Sets primary button in contacts
   * @param {String} contactPrimaryIcon icon for primary button
   * @param {Boolean} unmaskData true if data is unmasked
   */
  _setPrimaryButton(contactPrimaryIcon, unmaskData, hidePrimaryIconButtons) {
    if (contactPrimaryIcon) {
      return {
        icon: contactPrimaryIcon,
        disabled: !unmaskData,
        hidden: hidePrimaryIconButtons
      };
    }
  }

  /**
   * Checks if contact is masked from service with * character
   */
  checkUnmaskedContacts() {
    const areContactDetailsSet = this.customerContactDetails && this.customerContactDetails.length;
    this.unmaskData = !(areContactDetailsSet && this.customerContactDetails
      .some(el => (el.contact || '').includes('*')));
  }

  /**
   * Sets secondary button in contacts
   * @param {String} contactSecondaryIcon icon for secondary button
   */
  _setSecondaryButton(contactSecondaryIcon, hideSecondaryIconButtons) {
    if (contactSecondaryIcon) {
      return {
        icon: contactSecondaryIcon,
        disabled: false,
        hidden: hideSecondaryIconButtons
      };
    }
  }

  reset() {
    this._customerChanged();
    this.unmaskData = false;
  }

  /**
   * reset masked properties
   * @param {Object} pageActive
   */
  resetManualUnmaskedValues(pageActive) {
    if (pageActive && !pageActive.value) {
      if (this._taxResidenceIsUnmasked) {
        this._toggleTaxResidenceMask();
      }
      if (this.additionalDocumentsUnmasked) {
        this._onClickPersonalInfoMask();
      }
      if (this.addressIsUnmasked) {
        this.changeAddressMask({ unmasked: !this.addressIsUnmasked, title: '' });
      }
    }
  }

  /**
  * Dispatches an event to go to change password page
  * @emits 'glomo-customer-profile-change-password'
  */
  _changePassword() {
    this._dispatchEvent('glomo-customer-profile-change-password');
  }

  /**
   * Dispatches an event when clicking on secure phone help icon to open an info modal
   * @emits 'glomo-customer-profile-info-modal'
   * @param {Object} customEvent event from cliked help button in main phone
   */
  _infoSecurePhone(customEvent) {
    const title = (customEvent && customEvent.currentTarget.dataset.withoutTitle) ? '' : 'glomo-customer-profile-secure-phone';
    this.set('configModal', this._configureModal('GENERIC_CODE', 'glomo-customer-profile-for-sms', title, 'coronita:help',
      'glomo-customer-profile-secure-phone-modal', 'glomo-customer-profile-close'));
    this._dispatchEvent('glomo-customer-profile-info-modal', this._getInfoModal(this.configModal));
  }

  /**
   * Dispatches an event when clicking on main mail help icon to open an info modal
   * @emits 'glomo-customer-profile-info-modal'
   * @param {Object} customEvent event from cliked help button in main email
   */
  _infoMainMail(customEvent) {
    this.set('configModal', this._configureModal('GENERIC_CODE', 'glomo-customer-profile-automatic-records', '', 'coronita:help',
      'glomo-customer-profile-mail-modal', 'glomo-customer-profile-ok'));
    this._dispatchEvent('glomo-customer-profile-info-modal', this._getInfoModal(this.configModal));
  }

  /**
   * Dispatches an event to open a modal with all contacts (phones ot emails)
   * @emits 'glomo-customer-profile-view-all-phone'
   * @emits 'glomo-customer-profile-view-all-email'
   * @param {Object} e event from clicked 'View all' button
   */
  _viewAllItems(e) {
    const type = this._getContactType(e);
    const index = this._getContactIndex(e);
    if (type) {
      const detail = (this.userContactDetail && this.userContactDetail[type]) || (this.userAddressDetail && this.userAddressDetail[type]);
      this._dispatchEvent(`glomo-customer-profile-view-all-${type}`, this.viewAllWidthIndex ? detail[index] : detail);
    }
  }

  /**
   * Returns the index of a contact sent in an event
   * @param {Object} e event with contact detail
   */
  _getContactIndex(e) {
    return e && e.currentTarget && e.currentTarget.index;
  }

  /**
   * Dispatches an event when clicking on add an email or a phone
   * @param {Object} e event with contact detail data
   */
  _addNewCustomerContactDetail(e) {
    let type = this._getContactType(e);
    let param = { contactType: type, contactId: 'add' };
    this._goToEditContactDetail(param);
  }

  /**
   * Dispatches an event to go to edit contact detail
   * @emits 'glomo-customer-profile-edit-contact-detail'
   * @param {Object} params {contactId, contactType}
   */
  _goToEditContactDetail(params) {
    this._dispatchEvent('glomo-customer-profile-edit-contact-detail', params);
  }

  _editCustomerContactDetail(e) {
    let type = this._getContactType(e);
    let mainInfo = type === 'phone' ? (this.mainPhone && this.mainPhone.id) : (this.mainEmail && this.mainEmail.id);
    let id = (e && e.detail && e.detail.id) || mainInfo;
    this._goToEditContactDetail({ contactType: type, contactId: id });
  }

  /**
   * Dispatches an event to delete a contact (phone or email)
   * @emits 'glomo-customer-profile-delete-info'
   * @param {Object} e event from 'delete' button of a phone or an email
   */
  _deleteContact(e) {
    let id = e && e.detail && e.detail.id;
    if (id) {
      let isEmail = this.userContactDetail.email.some(elem => elem.id === id);
      let typeInfo = isEmail ? 'email' : 'phone';
      let detail = { id, 'type': typeInfo };
      this._dispatchEvent('glomo-customer-profile-delete-info', detail);
    }
  }

  /**
   * Returns true if the array has one or more items
   * @param {Array} array array of items
   */
  _isNotEmpty(array) {
    return array && array.length > 0;
  }

  /**
   * Returns true if the index is the last of the array
   */
  _isLast(index, arrayLength) {
    return index === (arrayLength - 1);
  }

  /**
   * Get the sections contained in the array or one section if the array contains items
   * @param {String} mainSectionTitleKey main section title key
   * @param {String} mainSectionTitleDefault main section title default
   * @param {Array} array array to parse sections from
   */
  _parseSections(mainSectionTitleKey, mainSectionTitleDefault, array = []) {
    let sections = [];

    const mainSection = {
      title: this.t(mainSectionTitleKey, mainSectionTitleDefault),
      items: array.filter(item => {
        return !item.items;
      })
    };

    const subSections = array.filter(item => {
      return item.items && item.items.length;
    });

    if (mainSection.items.length) {
      sections.push(mainSection);
    }

    sections = [...sections, ...subSections];

    sections.forEach(section => {
      this._setProductsActions(section.items);
    });

    return sections;
  }

  /**
   * Get the phone sections contained in the array or one section if the array contains items
   * @param {Array} array array to parse sections from
   */
  _parsePhoneSections(array = []) {
    return this._parseSections('glomo-customer-profile-contact-telephones', '_Contact telephones', array);
  }

  /**
   * Get the email sections contained in the array or one section if the array contains items
   * @param {Array} array array to parse sections from
   */
  _parseEmailSections(array = []) {
    return this._parseSections('glomo-customer-profile-contact-emails', '_Contact emails', array);
  }

  /**
   * Get the address sections contained in the array or one section if the array contains items
   * @param {Array} array array to parse sections from
   */
  _parseAddressSections(array = []) {
    const addressTemp = this._parseSections('glomo-customer-profile-contact-addresses', '_Contact addresses', array);
    let addressCount = 0;
    addressTemp.forEach(section => {
      addressCount += section.items.length;
    });
    this._hasReachedMaximumAddresses = addressCount >= this.maxVisibleContactDetails;
    return addressTemp;
  }


  /**
   * Computes if add new address button should be displayed.
   */
  _computeVisibleAddNewAddress(featureDisabled, exceedsAddresses) {
    return (!featureDisabled && !exceedsAddresses);
  }

  /**
   * Returns the type of a contact sent in an event
   * @param {Object} e event with contact detail
   */
  _getContactType(e) {
    return e && e.currentTarget && e.currentTarget.dataset && e.currentTarget.dataset.type;
  }

  /**
   * Returns an object with configuration for a modal alert
   * @param {String} code code of the modal
   * @param {String} headerTitle title of header
   * @param {String} title title of paragraph
   * @param {String} messageIcon name of icon in modal
   * @param {String} messageLabel message inside modal
   * @param {String} messageButtonLabel message of button in modal
   */
  _configureModal(code, headerTitle, title, messageIcon, messageLabel, messageButtonLabel) {
    return { code, headerTitle, title, messageIcon, messageLabel, messageButtonLabel };
  }

  /**
   * Returns an object to open an info glomo-alert-manager
   * @param {*} infoModal
   */
  _getInfoModal(infoModal) {
    return {
      code: infoModal.code,
      selectedConfig: {
        className: 'info full-height-error',
        openMaximized: true,
        iconOnlyFullHeight: true,
        title: infoModal.headerTitle,
        acceptBtLabel: infoModal.messageButtonLabel,
        template: {
          type: 'paragraphs',
          values: [
            { icon: infoModal.messageIcon },
            { title: infoModal.title },
            { text: infoModal.messageLabel }
          ]
        }
      }
    };
  }

  /**
   * Dispatches an event with data
   * @param {String} eventName name of event
   * @param {Object} detail data to send
   */
  _dispatchEvent(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      detail,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Returns complete name depending on if user or customer have data
   * @param {String} avatarSrc url of user avatar
   * @param {Object} customer customer object
   * @param {Object} user user object
   */
  _checkCustomerName(avatarSrc, customer, showErrorImage) {
    return !avatarSrc && customer && !!customer.completeName && !showErrorImage;
  }

  /**
   * Updates customer avatar source in case of error
   */
  _onImageError() {
    this.avatar = '';
  }

  /**
   * Observer of customer property
   */
  _customerChanged() {
    if (this.customer) {
      this.set('customerContactDetails', this.customer.info);
      this.set('customerAddress', this.customer.address);
      this.set('customerKycQuestionnaire', this.customer.kyc);
      this.set('avatarSrc', this.customer.avatar ? this.customer.avatar.url : '');
      this.showPersonalInformationError = Object.keys(this.customer).length === 0;
    }
  }

  /**
   * Dispatches an event to edit customer avatar
   */
  _editAvatar() {
    const hasFiles = !!((this.$.inputfile || {}).files || []).length;
    if (hasFiles) {
      this._dispatchEvent('edit-avatar', this.$.inputfile.files[0]);
    } else {
      this._dispatchEvent('glomo-customer-profile-edit-contact-avatar');
    }
  }
  /**
  * Create avatar base64 image source
  */
  _avatarSrcComputed(avatar) {
    if (typeof avatar === 'string') {
      return avatar;
    }
    return avatar && avatar.value || '';
  }

  /**
   * Dispatches an event to save the avatar profile in local storage
   * @param {String} avatar image on base64
   */
  setAvatar(avatar) {
    this.set('avatar', avatar);
    this._dispatchEvent('set-local-storage', {
      key: 'new_avatar_profile',
      value: {
        url: this.get('customer.avatars.url', this.globalCacheStorage) || avatar,
        image: avatar//image on base64
      }
    });
  }

  /**
   * Compute last access date
   */
  _computeLastAccessDate(lastAccessDate) {
    return lastAccessDate ? moment(lastAccessDate).format(this.lastAccessDateFormat) : '';
  }

  /**
   * Get avatar´name , or if it don't exist, get the user´s full name
   * @param {Object} customer
   */
  _getCustomerAvatarName(customer) {
    const completeName = this.get('completeName', customer);
    const avatarCompleteName = this.get('avatarCompleteName', customer);
    return avatarCompleteName ? avatarCompleteName : completeName;
  }

  /**
   * Section title
   */
  _sectionTitle(hideSection, singularTitle, pluralTitle, _sections = []) {
    const plural = hideSection && _sections.reduce((count, section) => {
      return count + section.items.length;
    }, 0) > 1;

    return plural ? pluralTitle : singularTitle;
  }

  /**
   * Compute phone section title
   */
  _computePhoneSectionTitle(hideMainPhone, _phoneSections) {
    return this._sectionTitle(hideMainPhone, this.t('glomo-customer-profile-phone', '_Phone'), this.t('glomo-customer-profile-phones', '_Phones'), _phoneSections);
  }

  /**
   * Compute email section title
   */
  _computeEmailSectionTitle(hideMainEmail, _emailSections) {
    return this._sectionTitle(hideMainEmail, this.t('glomo-customer-profile-email', '_Email'), this.t('glomo-customer-profile-emails', '_Emails'), _emailSections);
  }

  /**
   * Compute address section title
   */
  _computeAddressSectionTitle(hideMainAddress, _addressSections) {
    return this._sectionTitle(hideMainAddress, this.t('glomo-customer-profile-address', '_Address'), this.t('glomo-customer-profile-addresses', '_Addresses'), _addressSections);
  }

  /**
   * Is section visible?
   */
  _visibleSection(hideMain, items) {
    return !hideMain || this._isNotEmpty(items);
  }

  /**
   * Compute visible phones section
   */
  _computeVisiblePhoneSection(items, sectionHideFlag) {
    return !sectionHideFlag && this._visibleSection(this.hideMainPhone, items);
  }
  /**
   * Compute visible emails section
   */
  _computeVisibleEmailSection(items, sectionHideFlag) {
    return !sectionHideFlag && this._visibleSection(this.hideMainEmail, items);
  }
  /**
   * Compute visible addresses section
   */
  _computeVisibleAddressSection(items) {
    return this._visibleSection(this.hideMainAddress, items);
  }

  /**
   * Compute visible addresses section
   */
  _computeVisibleAddressesSection(addresses) {
    return addresses && Object.keys(addresses).length > 0;
  }
  computeHidePrincipalAddress(addresses) {
    const principalAddress = this.c(addresses, 'principalAddress', {});
    return Object.keys(principalAddress).length > 0;
  }
  computeHideSecondaryAddress(addresses) {
    const secondaryAddress = this.c(addresses, 'secondaryAddress', {});
    return Object.keys(secondaryAddress).length > 0;
  }
  _computeEditAddress(unmaskData) {
    return !unmaskData;
  }
  _computeAddressEditClass(unmaskData) {
    return !unmaskData ? 'disabled-button' : '';
  }

  _computeUnmaskDataInfo(unmaskData) {
    return !unmaskData && !this.hideUnmaskDataInfo;
  }

  /**
   * Compute hide customer section
   */
  _computeHideCustomerSection(customer, hideCustomerSectionWhenCustomerIsNull) {
    const nullCustomer = !customer || !Object.keys(customer).length;
    return hideCustomerSectionWhenCustomerIsNull && nullCustomer;
  }

  /**
   * Compute hide tax residence section
   */
  _computeShowTaxResidenceSection(customer) {
    return Object.prototype.hasOwnProperty.call((customer || {}), 'taxResidence') && !this.hideResidenceTaxSection;
  }

  /**
   * Compute hide customer address section
   */
  _computeShowAddressSection(customerAddress, fullProfile, showAddress) {
    return (customerAddress && !fullProfile && showAddress);
  }

  /**
   * View contracts link event handler
   * @emits 'glomo-customer-profile-view-contracts'
   */
  _onViewContracts() {
    this._dispatchEvent('glomo-customer-profile-view-contracts');
  }

  /**
   * Detail confirm success event handler
   */
  onDetailConfirmSuccess(detail) {
    const sections = '_' + detail.type + 'Sections';

    const sectionItemIndexes = this[sections].map(s => {
      return s.items.reduce((acc, item, index) => {
        if (item.id === detail.id) {
          acc.push(index);
        }
        return acc;
      }, []);
    });
    sectionItemIndexes.forEach((itemIndexes, sectionIndex) => {
      itemIndexes.forEach(itemIndex => {
        this.set([sections, sectionIndex, 'items', itemIndex, 'isChecked'].join('.'), true);
        this._updateProductsActions(detail.type, sectionIndex);
      });
    });

    this._dispatchEvent('update-' + detail.type + '-product-selector-product', {
      idKey: 'id',
      idValue: detail.id,
      propertyKey: 'isChecked',
      propertyValue: true
    });

    this._dispatchEvent('customer-detail-confirm-success-message', this.t('glomo-customer-profile-detail-confirm-success-' + detail.type, detail.type + ' confirmed', '_Detail confirm success'));
  }

  /**
   * Detail confirm error event handler
   */
  onDetailConfirmError(detail) {
    this._dispatchEvent('customer-detail-confirm-error-message', this.t('glomo-customer-profile-detail-confirm-error-' + detail.type, detail.type + ' confirm error', '_Detail confirm error'));
  }

  /**
   * Add products actions to products
   */
  _setProductsActions(products) {
    products.forEach((p, i) => {
      const _productActions = this.detailItemActions.map(a => {
        return Object.assign({
          hidden: this._setHiddenAction(a, p)
        }, a);
      });
      products[i]._productActions = _productActions;
    });
  }

  /**
   * Sets if action button is hidden, hiddenIfNot or not hidden
   * @param {Object} action
   * @param {Object} product
   */
  _setHiddenAction(action, product) {
    if (action.hiddenIf) {
      return !!(this.get(action.hiddenIf, product));
    }
    if (action.hiddenIfNot) {
      return !(this.get(action.hiddenIfNot, product));
    } else {
      return !!(action.hidden);
    }
  }

  /**
   * Update products actions in products
   */
  _updateProductsActions(type, index) {
    const products = this['_' + type + 'Sections'][index];

    if (products && products.items && products.items.length) {
      this._setProductsActions(products.items);
      this.set(['_' + type + 'Sections', index, 'items'].join('.'), Array.from(products.items));
    }
  }

  /**
   * Dispatches an event to send customer validation email
   */
  _validationReminder() {
    this._dispatchEvent('glomo-customer-profile-validation-reminder');
  }

  /**
   * Returns True if item isValidated, false in other case
   */
  _isValidated(item) {
    return !!(item || {}).isValidated;
  }

  /**
   * return true if object have some property
   * @param {Object} item
   * @param {String} prop
   */
  _validateProp(item, prop) {
    return Object.prototype.hasOwnProperty.call((item || {}), prop);
  }

  /**
   * validate if an object is empty
   * @param {Object} obj
   */
  _validateObjectIsEmpty(obj) {
    return !Object.keys(obj || {}).length;
  }

  /**
   * validate if an object is empty
   * @param {Object} arr
   */
  _validateArrayIsEmpty(arr) {
    return Boolean((arr || []).length);
  }

  /**
   * Returns true if can show icon to edit mainEmail, false in other case.
   * @param {item} detail mainEmail data
   */
  _showEditEmailIcon(item) {
    return (this.enableEditEmail && !item.nonValidatedEmail);
  }

  /**
   * Returns true when fullprofile or enablePassowrd are enabled.
   */
  _enableChangePassword(fullProfile, enablePassword) {
    return (fullProfile || enablePassword);
  }

  /**
   * Returns true to hide change button on image section.
   * @param {*} immutableProfile is true when profile fields can't change
   * @param {*} showErrorImage is true when error image is displayed
   */
  _hideChangeButton(immutableProfile, showErrorImage) {
    return (immutableProfile || showErrorImage);
  }

  /**
   * Dispatches a custom event when retry button is clicked
   */
  _onRetryAvatarClick() {
    this._dispatchEvent('glomo-customer-profile-retry-avatar-click');
  }

  /**
   * Toggle tax residence information flag and button label
   */
  _toggleTaxResidenceMask() {
    this._taxResidenceIsUnmasked = !this._taxResidenceIsUnmasked;
  }

  /**
   * Increment a number by 1
   * @param {Number} index
   */
  _incrementIndex(index) {
    return Number(index) + 1;
  }

  /**
   * compute if no-mobile help icon must show if showHelpIcons is enabled
   * @param {Boolean} generalFlag showHelpIcons prop
   * @param {Boolean} noMobileFlag hideShowDataNotFullProfile
   * @returns {Boolean}
   */
  _computeShowNoMobileHelpIcon(generalFlag, noMobileFlag) {
    return generalFlag && !noMobileFlag;
  }

  /**
   * get dataset
   * @param {Object} e
   * @param {String} prop
   */
  _getDatasetProperty(e, prop) {
    return e && e.currentTarget && e.currentTarget.dataset && e.currentTarget.dataset[prop] || '';
  }

  /**
   * dispatchs an event from generic button concatenating action + dataset.type
   * @param {Object} customEvent
   */
  _dispatchGenericEventSection(customEvent) {
    const type = this._getDatasetProperty(customEvent, 'type');
    const subType = this._getDatasetProperty(customEvent, 'subtype');
    const action = this._getDatasetProperty(customEvent, 'action');
    this._dispatchEvent(`glomo-customer-profile-${action}-${type}`,
      subType ? subType : null);
  }

  /**
   * dispatchs an event from generic retry button concatenating dataset.section
   * @param {Object} customEvent
   */
  _onRetryLoadData(customEvent) {
    const section = this._getDatasetProperty(customEvent, 'section');
    this._dispatchEvent(`glomo-customer-profile-retry-load-${section}`);
  }

  /**
   * Emits an event for calling support button click when max retries error obtained.
   * @param {Object} customEvent
   */
  _handleCallBBVAClick(customEvent) {
    this._dispatchEvent('open-call-action', {
      value: this.assistancePhone
    });
  }

  _computeContactsUnmasked(contacts = []) {
    const contactsAreSet = contacts && contacts.length;
    if (contactsAreSet) {
      return contacts.some(contact => contact.unmasked);
    }
  }

  /**
   * click show/hide data contact details handler
   * @param {Object} customEvent
   */
  _onChangeContactsMask() {
    const action = this._contactsUnmasked ? 'mask' : 'unmask';
    this._dispatchEvent(`glomo-customer-profile-${action}-contacts`);
  }

  _onChangeAddressMask() {
    const action = this.addressIsUnmasked ? 'mask' : 'unmask';
    this._dispatchEvent(`glomo-customer-profile-${action}-address`);
  }

  /**
   * compute show/hide section button label
   * @returns {String}
   */
  _computeSectionShowHideLabel(sectionIsUnmasked) {
    return sectionIsUnmasked
      ? 'glomo-customer-profile-mask'
      : 'glomo-customer-profile-unmask';
  }

  _computeSectionWarningLabel(sectionIsUnmasked) {
    return sectionIsUnmasked
      ? 'glomo-customer-profile-fill-info-label'
      : 'glomo-customer-profile-enable-edition-label';
  }

  /**
   * change settings on change personal information mask
   */
  _onClickPersonalInfoMask() {
    this._showHidePersonalInfoDocuments = this.additionalDocumentsUnmasked ?
      'glomo-customer-profile-unmask' : 'glomo-customer-profile-mask';
    this.additionalDocumentsUnmasked = !this.additionalDocumentsUnmasked;
  }

  /**
   * compute if birth date is masked
   * @param {Boolean} unmasked
   * @returns {String}
   */
  _computeBirthDateMasked(unmasked) {
    const getDate = this.customer?.birthData?.birthDate.replaceAll('-', '/');
    return unmasked ? moment(getDate).format('L') : '••/••/••';
  }

  /**
   * compute edit button class in order to force disable
   * @param {Boolean} forceDisabled force disabled flag
   * @returns {String}
   */
  _computeAdditionalDocsEditClass(forceDisabled = false) {
    return forceDisabled ? 'force-disabled' : 'disabled-blue';
  }

  /**
   * validate what button to edit avatar is necessary showed: input button or button
   * @param {Boolean} fullProfile
   * @param {Boolean} showEditAvatarButton
   * @returns
   */
  _computeShowEditAvatarButton(fullProfile, showEditAvatarButton) {
    return showEditAvatarButton ? showEditAvatarButton : fullProfile;
  }

  /**
   * compute if contracts section must be showed on not full profile
   * @param {Boolean} showContractsSection
   * @param {Boolean} fullProfile
   * @returns {Boolean}
   */
  _computeShowContractsSection(showContractsSection, fullProfile) {
    return showContractsSection && !fullProfile;
  }

  /**
   * compute if contracts section must be showed on not full profile
   * @param {Boolean} showUpdateRfcSection
   * @param {Boolean} fullProfile
   * @returns {Boolean}
   */
  _computeShowUpdateRfcSection(showUpdateRfcSection, fullProfile) {
    return showUpdateRfcSection && !fullProfile;
  }

  /**
   * Active contracts sections
   */
  displayContractsSection() {
    this.showContractsSection = true;
  }

  /**
   * Wrapper for displaying max retries flag.
   */
  _computeDisplayPersonalInformationErrorMaxRetries(newFlagValue) {
    return newFlagValue;
  }

  /** Compute if unsubscribe section must be showed or not
   * @param {Boolean} visibleUnsubscribeSection
   * @param {Boolean} customer
   * @returns {Boolean}
   */
  _computeShowUnsubscribeSection(visibleUnsubscribeSection, customer = {}) {
    return visibleUnsubscribeSection && (((Object.keys(customer).length) !== 0) || this.notWaitForCustomer);
  }

  /**
   * Dispatch unsubscribe events
   */
  _onUserUnsubscribe() {
    this._dispatchEvent('analytics-glomo-customer-profile-unsubscribe-link');
    this._dispatchEvent('glomo-customer-profile-unsubscribe');
  }

  changeAddressMask({ unmasked, title }) {
    this.addressIsUnmasked = unmasked;
    this.set('customerAddress.title', title);
  }

  _taxResidenceKeyContainerClass() {
    return this._validateProp(this.customer.taxResidence, 'status') ? 'supress-bottom-margin' : '';
  }

  /**
   * Handles clicks on button list, specifically for  the sub-page menu.
   */
  _onButtonListClick(evt) {
    if (evt.detail.id) {
      this._dispatchEvent(`glomo-customer-profile-sub-page-menu-button-${evt.detail.id}-clicked`);
    }
    this._dispatchEvent('glomo-customer-profile-sub-page-menu-button-clicked', evt.detail);
  }

  /**
   * Compute hide fiscal data section
   */
  _computeShowFiscalDataSection(customerFiscalData, hideFiscalDataSection) {
    return (((Object.keys(customerFiscalData).length) !== 0) && !hideFiscalDataSection);
  }
  /**
   * Compute click button fiscal data
   */
  _onFiscalDataShowDataClick() {
    const action = this.customerFiscalData.showHide ? 'hide' : 'show';
    this._dispatchEvent(`glomo-customer-profile-${action}-fiscal-data`);
  }

  /**
   * Compute event type fiscal data
   * @param {Object} customerFiscalData
   */
  _computeShowHideFiscalDataLabel(customerFiscalData) {
    const label = customerFiscalData.showHide ? 'hide' : 'show';
    return `glomo-customer-profile-fiscal-data-${label}`;
  }

  _addAddress(e) {
    const address = this.addresses[e.currentTarget.dataset.type];
    this._dispatchEvent('add-profile-address', { isPrincipal: e.currentTarget.dataset.type === 'principalAddress' });
  }

  _editAddress(e) {
    const address = this.addresses[e.currentTarget.dataset.type];
    this._dispatchEvent('edit-profile-address', { address, isPrincipal: e.currentTarget.dataset.type === 'principalAddress' });
  }

  /**
   * Changed the value of the property _showAditionalAccounts
   * when is true the button
   */
  _onShowAccountsMask() {
    this._showAditionalAccounts = !this._showAditionalAccounts;
  }

  /**
   * @description event for request to cancel cfdi
   * @event glomo-customer-profile-request-to-update-rfc
   */
  _onRequestToUpdateRfc() {
    this._dispatchEvent('glomo-customer-profile-request-to-update-rfc');
  }

  /**
   * Show or hide the button with the legend 'Show more' or 'Show less'
   * depending of the following validation.
   * @param {Object} accounts
   * @param {Boolean} showAditionalAccounts
   * @param {Boolean} hasRecipients
   * @return {Boolean}
   */
  _showMoreButton(accounts, showAditionalAccounts, hasRecipients) {
    return (accounts.length > 0 && !showAditionalAccounts && hasRecipients);
  }

  /**
   * Dispatch an event called glomo-customer-profile-edit-recipient-button-click
   * and send the value of the property hasRecipients.
   * @event glomo-customer-profile-edit-recipient-button-click
   */
  _dispatchRegisterBeneficiary() {
    const params = {
      page: 'recipientsInit',
      params: this.hasRecipients,
    };
    this._dispatchEvent('glomo-customer-profile-edit-recipient-button-click', params);
  }
}
window.customElements.define(GlomoCustomerProfile.is, GlomoCustomerProfile);
